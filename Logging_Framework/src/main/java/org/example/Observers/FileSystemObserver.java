package org.example.Observers;

public class FileSystemObserver implements Observer {
    @Override
    public void update() {
        System.out.println("File System observer is notified");
    }
}
