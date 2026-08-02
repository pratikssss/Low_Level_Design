package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Logger loggerChain = Application.getChainOfLoggers();
        loggerChain.logMessage(Logger.INFO,"This is an information");
        loggerChain.logMessage(Logger.DEBUG, "This is in Debug mode");
        loggerChain.logMessage(Logger.ERROR, "This is in Error mode");
    }
}

//What it is: It lets you pass a request along a chain of potential handlers. When a handler receives a request, it decides either to process it or to pass it to the next handler in the chain.
//When to use it in interviews: When multiple objects might handle a request, and you don't want the sender to hard-code which receiver to use.
//Classic Interview Examples: * Logging Frameworks (passing a log message to an Info Logger ➔ Debug Logger ➔ Error Logger).
//
//ATM Cash Dispenser (trying to dispense ₹5000: passes through the ₹2000 note dispenser ➔ ₹500 note dispenser ➔ ₹100 note dispenser).
//
//Authentication Filters (checking valid token ➔ checking user permissions ➔ checking IP address).