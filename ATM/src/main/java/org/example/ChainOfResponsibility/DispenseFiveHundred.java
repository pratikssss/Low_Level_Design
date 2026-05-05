package org.example.ChainOfResponsibility;

import org.example.Enums.Denominations;

public class DispenseFiveHundred extends Dispenser{
    private Dispenser dispenser;
    public DispenseFiveHundred() {
        this.handlerLevel = Denominations.FIVEHUNDRED.getValue();
    }
}
