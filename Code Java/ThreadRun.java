package com.fun;

public class ThreadRun {
    public static void main(String[] args) {

        Thread t1 = new Thread("Running Thread 1...");
        Thread t2 = new Thread("Running Thread 1...");

        t1.start();
        t2.start();

    }
}
