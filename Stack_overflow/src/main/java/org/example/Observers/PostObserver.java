package org.example.Observers;

import org.example.Entities.Event;

public interface PostObserver {
    void onPostEvent(Event event);
}
