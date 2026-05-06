package org.example;

public class MobilePhone {
    private MobileAlertState currentState;
    public MobilePhone() {
        this.currentState = new RingingState();
    }

    public void setAlertState(MobileAlertState state) {
            this.currentState = state;
    }

    public void recieveMessage() {
        // The phone doesn't use if/else. It just tells the current state to act.
        currentState.alert();
    }
}
