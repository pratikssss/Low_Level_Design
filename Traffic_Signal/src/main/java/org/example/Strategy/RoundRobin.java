package org.example.Strategy;

import org.example.StrategyInterface;
import org.example.TrafficSignal.TrafficSignal;

import java.util.List;

public class RoundRobin implements StrategyInterface {

    @Override
    public void strategy(List<TrafficSignal> trafficSignalList) {
        // Round robin strategy
        for(TrafficSignal trafficSignal:trafficSignalList) {
            trafficSignal.currentSignalColor();
        }
    }

}
