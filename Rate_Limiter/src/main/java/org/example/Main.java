package org.example;

import org.example.Entities.User;
import org.example.Strategy.FixedWindowRateLimiter;
import org.example.Strategy.StrategyFactory;
import org.example.Strategy.StrategyInterface;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        User user = new User("Pratik");
        StrategyInterface strategy = StrategyFactory.selectStrategy("FixedWindowRateLimiter", user, 5,5000);
        for(int i=0; i<40; i++) {
            strategy.apiHit();
            // Wait 200ms between requests
            Thread.sleep(200);
        }
    }
}