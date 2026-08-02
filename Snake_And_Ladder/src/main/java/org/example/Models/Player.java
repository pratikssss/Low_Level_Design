package org.example.Models;

public class Player {
    private int position;
    private String name;
    public Player(String name) {
        this.position = 0;
        this.name = name;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    public int getPosition() {
        return this.position;
    }
    public String getName() {
        return name;
    }
}
