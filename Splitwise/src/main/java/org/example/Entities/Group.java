package org.example.Entities;
import java.util.List;
public class Group {
    private String groupOwner;
    private List<String> members;
    public Group(String owner, List<String> members) {
        this.groupOwner = owner;
        this.members = members;
    }
    public String getGroupOwner() {
        return groupOwner;
    }
    public List<String> getMembers() {
        return members;
    }
}
