package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.recieveMessage();
        mobilePhone.setAlertState(new VibrateState());
        mobilePhone.recieveMessage();
        mobilePhone.setAlertState(new SilentState());
        mobilePhone.recieveMessage();
    }
}

//What it is: Instead of using if/else to check an object's "mode" before doing something, you create a separate class for each mode. The main object just passes the job to whichever mode class is currently active.
//When to use it in interviews: When an object has distinct "modes" and behaves entirely differently depending on which mode is active.