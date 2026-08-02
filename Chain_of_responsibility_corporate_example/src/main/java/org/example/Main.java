package org.example;

abstract class Approver {
    protected Approver nextApprover;
    public void setNextApprover(Approver approver) {
        nextApprover = approver;
    }
    public abstract void processRequest(int amount);
}
class Manager extends Approver {
    public void processRequest(int amount) {
        if(amount<=500) {
            System.out.println("Manager approved");
        }
        else {
            nextApprover.processRequest(amount);
        }
    }
}
class Director extends Approver {
    public void processRequest(int amount) {
        if(amount<=1000) {
            System.out.println("Director approved");
        }
        else {
            nextApprover.processRequest(amount);
        }
    }
}
class CEO extends Approver {
    public void processRequest(int amount) {
        if(amount<=2000) {
            System.out.println("CEO approved");
        }
        else {
            System.out.println("CEO rejected");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Approver manager = new Manager();
        Approver director = new Director();
        Approver CEO = new CEO();
        manager.setNextApprover(director);
        director.setNextApprover(CEO);
        manager.processRequest(1400);
    }
}