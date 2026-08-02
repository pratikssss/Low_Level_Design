package org.example;
import org.example.Entities.Card;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BankService {
    private final Map<Card, String> cardAccountMap = new ConcurrentHashMap<>();
    private final Map<String, Integer> accountBalanceMap = new ConcurrentHashMap<>();
    private final Map<Card, String> cardPinMap = new ConcurrentHashMap<>();
    public static volatile BankService bankServiceInstance;

    public static BankService getBankServiceInstance() {
        if (bankServiceInstance == null) {
            bankServiceInstance = new BankService();
        }
        return bankServiceInstance;
    }
    public Map<Card, String> getCardAccountMap() {
        return this.cardAccountMap;
    }
    public Map<String, Integer> getAccountBalanceMap() {
        return this.accountBalanceMap;
    }
    public Map<Card, String> getCardPinMap() {
        return this.cardPinMap;
    }
    public void attachCardToAccount(Card card, String accountNumber) {
        cardAccountMap.put(card,accountNumber);
    }
    public void addBalanceToAccount(String accountNumber, int amount) {
        if (accountBalanceMap.containsKey(accountNumber)) {
            accountBalanceMap.put(accountNumber,accountBalanceMap.get(accountNumber)+amount);
        }
        else {
            accountBalanceMap.put(accountNumber, amount);
        }
    }

}