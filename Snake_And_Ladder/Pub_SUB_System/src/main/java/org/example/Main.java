package org.example;

public class Main {
    public static void main(String[] args) {
        Subject topicA = new Topic("Sports");
        Subject topicB = new Topic("News");

        Observer sub1 = new Subscriber("Alice");
        Observer sub2 = new Subscriber("Bob");

        topicA.addObserver(sub1);
        topicA.addObserver(sub2);

        topicB.addObserver(sub2);
        topicA.publish(new Message("Lakers won the game!"));
        topicB.publish(new Message("Stock market goes up!"));
    }
}

// There are topics(Subject) which will be subscribed by subscribers(Observer)
// A message will be published to topicA and it will be delivered to the observers listening to it
// Now in topic.java if we dont use executorService then output will look like this
// Publishing to Sports: Lakers won the game!
// Subscriber Alice received from Sports -> Payload: Lakers won the game! [Handled by Thread: main]
// Subscriber Bob received from Sports -> Payload: Lakers won the game! [Handled by Thread: main]
// Publishing to News: Stock market goes up!
// Subscriber Bob received from News -> Payload: Stock market goes up! [Handled by Thread: main]

// Issue here is publishing to news will not start unless publishing to sports is over
// To solve this we can use executorService so that this is an asynchronous process
// output in this case
// Publishing to Sports: Lakers won the game!
// Publishing to News: Stock market goes up!
// Subscriber Bob received from Sports -> Payload: Lakers won the game! [Handled by Thread: pool-1-thread-2]
// Subscriber Alice received from Sports -> Payload: Lakers won the game! [Handled by Thread: pool-1-thread-1]
// Subscriber Bob received from News -> Payload: Stock market goes up! [Handled by Thread: pool-2-thread-1]


