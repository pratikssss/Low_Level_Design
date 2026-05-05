package org.example.ChainOfResponsibility;

import org.example.Enums.Denominations;

public class DispenseThousand extends Dispenser{
    private Dispenser dispenser;
    public DispenseThousand() {
        this.handlerLevel = Denominations.THOUSAND.getValue();
    }
}
