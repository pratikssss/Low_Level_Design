package org.example.Entities;

import org.example.Enums.EventType;

public class Event {
    private final EventType eventType;
    private final User actor; // user who performed the action
    private final Post targetPost;

    public Event(EventType eventType, User actor, Post targetPost) {
        this.eventType = eventType;
        this.actor = actor;
        this.targetPost = targetPost;
    }
    public User getActor() {
        return this.actor;
    }
    public Post getTargetPost() {
        return this.targetPost;
    }
    public EventType getType() {
        return eventType;
    }
}
