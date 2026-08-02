package org.example;

public class Coke implements Items{
    String description;
    int price;
    int quantity;
    public Coke(String description, int price, int quantity) {
            this.description = description;
            this.price = price;
            this.quantity = quantity;
    }
    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void decreaseQuantity() {
        this.quantity = this.quantity-1;
    }
}
