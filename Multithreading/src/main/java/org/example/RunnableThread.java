// Runnable thread example

package org.example;

public class RunnableThread {
    // 1. The Task (The Job Description)
    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("MyRunnable running");
            System.out.println("MyRunnable finished");
        }
    }

    public static void main(String[] args) {
        // 2. The Hire & Assign
        Thread thread = new Thread( new MyRunnable() );

        // 3. The Execution
        thread.start();
    }
}
