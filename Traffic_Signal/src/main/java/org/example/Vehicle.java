package org.example;

public class Vehicle implements Observer{
    private String id;
    public Vehicle(String id) {
        this.id = id;
    }
    public String getId() {
        return this.id;
    }

    @Override
    public void updateObserver() {
        System.out.println("Vehicle with id "+this.id +" you are free to go");
    }
}
