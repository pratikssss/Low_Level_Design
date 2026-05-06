package org.example.Entities;

public abstract class Coffee {
     private int price=5;
     private String description = "Normal coffee";
     public int getPrice() {
         return this.price;
     }
    public String getDescription() {
        return this.description;
    }
}
