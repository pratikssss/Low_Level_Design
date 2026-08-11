package org.example;

import org.example.Entities.User;
import org.example.Strategies.Strategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Splitwise {
    private static Splitwise instance;
    private static Map<String, Map<String, Integer>> balances;
    private static List<User> members;
    public void registerMembers(List<User> members) {
        for(int i=0;i<members.size();i++) {
            Map<String, Integer> mp = new HashMap<>();
            for(int j=0;j<members.size();j++) {
                if(i!=j) {
                    mp.put(members.get(j).getUsername(), 0);
                }
            }
            balances.put(members.get(i).getUsername(), mp);
        }
    }
    public Map<String, Map<String, Integer>> getbalances() {
        return balances;
    }
    public static synchronized Splitwise getInstance() {
        if(instance == null) {
            balances = new HashMap<>();
            instance = new Splitwise();
        }
        return instance;
    }
    public synchronized void split(String payedBy, List<String> membersInvolved, Strategy strategy, int amount) {
        int noOfMembers = membersInvolved.size();
        int share = amount/noOfMembers;
        Map<String, Integer> BalancesToUpdate = balances.get(payedBy);
        for(Map.Entry<String, Integer> balancesToUpdate: BalancesToUpdate.entrySet()) {
            int getValue = balancesToUpdate.getValue();
            getValue += share;
            balancesToUpdate.setValue(getValue);
        }
        for(int i=0; i<membersInvolved.size(); i++) {
            if(!payedBy.equals(membersInvolved.get(i))) {
                Map<String, Integer> othersBalance = balances.get(membersInvolved.get(i));
                othersBalance.put(payedBy, othersBalance.get(payedBy) - share);
            }
        }
    }
}
