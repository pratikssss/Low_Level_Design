package org.example;

// pratik mahajan
interface OrderProcessor {
    public void processOrder(double amount);
}
// Before: Each processor duplicates tax calculation
class USOrderProcessor implements OrderProcessor{

    @Override
    public void processOrder(double amount) {

    }
}

class EUOrderProcessor implements OrderProcessor {
    public void processOrder(double amount) {
        double tax = amount * 0.20; // Duplicated tax logic
        double total = amount + tax;
        System.out.println("EU Order - Subtotal: $" + amount
                + ", Tax: $" + tax + ", Total: $" + total);
    }
}

class UKOrderProcessor implements OrderProcessor{
    public void processOrder(double amount) {
        double tax = amount * 0.15; // Duplicated tax logic
        double total = amount + tax;
        System.out.println("UK Order - Subtotal: $" + amount
                + ", Tax: $" + tax + ", Total: $" + total);
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}