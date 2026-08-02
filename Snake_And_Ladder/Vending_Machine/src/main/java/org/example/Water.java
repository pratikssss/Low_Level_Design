package org.example;

public class Water implements Items{
    String description;
    int price;
    int quantity;
    public Water(String description, int price, int quantity) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }
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
