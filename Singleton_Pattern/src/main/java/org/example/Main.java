package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            DataBaseConnection db1 = DataBaseConnection.getInstance();
            DataBaseConnection db2 = DataBaseConnection.getInstance();
            if(db1 == db2) {
                System.out.println("Same thread");
            }
    }
}


//What it is: Ensures a class has only one instance, and provides a global point of access to it.
//When to use it in interviews: Whenever creating multiple instances of a class would be a waste of memory or cause conflicts. Examples: A Database Connection Pool, a Logger class, or a Configuration Manager.
//The Interview Trap: Interviewers will almost always ask you to make it thread-safe. If you just use a basic if (instance == null), two threads might create two instances at the exact same time. You need "Double-Checked Locking."