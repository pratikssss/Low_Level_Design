package org.example;

public class Subscriber implements Observer{
    String observerId;

    public Subscriber(String aObserver) {
        this.observerId = aObserver;
    }

    public void update(Topic topic, Message message) {
        String var10001 = this.observerId;
        System.out.println("Subscriber " + var10001 + " received from " + topic.getTopic() + " -> Payload: " + message.getContent() + " [Handled by Thread: " + Thread.currentThread().getName() + "]");
    }

    public String getObserverId() {
        return this.observerId;
    }
}
