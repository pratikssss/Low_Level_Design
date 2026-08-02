package org.example;

public class DataBaseConnection {
    private static volatile DataBaseConnection instance;
    private DataBaseConnection() {

    }
    public static DataBaseConnection getInstance() {
        // First check (no locking, fast)
        if (instance ==  null) {
            // Lock the class only if instance is null
            synchronized (DataBaseConnection.class) {
                // Second check (inside the lock, safe)
                if (instance == null) {
                    instance = new DataBaseConnection();
                }
            }
        }
        return instance;
    }
}
