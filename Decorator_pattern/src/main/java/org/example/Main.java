package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coffee myOrder = new SimpleCoffee();
        myOrder = new Milk(myOrder);
        myOrder = new Sugar(myOrder);
        System.out.println(myOrder.getCost());
        System.out.println(myOrder.getDescription());
    }
}

//What it is: Allows you to attach new behaviors or responsibilities to an object dynamically at runtime without altering its structure. It's a much more flexible alternative to creating a massive inheritance tree (subclassing).
//When to use it in interviews: When you are adding "extras" or "add-ons" to a base item. Examples: Adding toppings to a Pizza, milk/sugar to Coffee, or adding scrollbars to a UI Window.