//Basic thread example

package org.example;

public class ThreadExample {
    // 2. Now, Java knows "Thread" means the official built-in one.
    public static class MyThread extends Thread {
        public void run() {
            System.out.println("MyThread running");
            System.out.println("MyThread finished");
        }
        public void runAgain() {
            System.out.println("Run again");
        }
    }
    public static class MyThread1 extends Thread {
        public void run() {
            System.out.println("MyThread1 running");
            System.out.println("MyThread1 finished");
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
    }
}