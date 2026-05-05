package org.example.Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Answer extends Post{
    private boolean isAccepted = false;

    public Answer(String body, User author) {
        super(UUID.randomUUID().toString(), body, author);
    }

    public void setAccepted(boolean accepted) {
        isAccepted = accepted;
    }

    public boolean isAccepted() { return isAccepted; }
}
