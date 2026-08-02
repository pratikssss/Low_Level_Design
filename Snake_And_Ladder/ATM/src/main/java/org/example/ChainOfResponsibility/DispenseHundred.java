package org.example.ChainOfResponsibility;

import org.example.Enums.Denominations;

public class DispenseHundred extends Dispenser{
    private Dispenser dispenser;
    public DispenseHundred() {
        this.handlerLevel = Denominations.HUNDRED.getValue();
    }
}
