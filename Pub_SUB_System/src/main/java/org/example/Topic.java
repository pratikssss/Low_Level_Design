package org.example;

import java.io.PrintStream;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Topic implements Subject{
    List<Observer> observers = new CopyOnWriteArrayList();
    String topic;
    private final ExecutorService executorService = Executors.newCachedThreadPool();

    public Topic(String topicA) {
        this.topic = topicA;
    }

    public void addObserver(Observer o) {
        this.observers.add(o);
    }

    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    public void publish(Message message) {
        PrintStream var10000 = System.out;
        String var10001 = this.getTopic();
        var10000.println("Publishing to " + var10001 + ": " + message.getContent());

        for(Observer o : this.observers) {
            this.executorService.submit(() -> o.update(this, message));
        }

    }

    public String getTopic() {
        return this.topic;
    }
}
