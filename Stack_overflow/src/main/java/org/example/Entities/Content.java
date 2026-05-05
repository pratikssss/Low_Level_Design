package org.example.Entities;

public abstract class Content {
        protected final String id;
        protected final String body;
        protected final User author;

    protected Content(String id, String body, User author) {
        this.id = id;
        this.body = body;
        this.author = author;
    }
    public String getId() {
        return this.id;
    }
    public String getBody() {
        return this.body;
    }
    public User getAuthor() {
        return this.author;
    }
}
