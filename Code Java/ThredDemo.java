package com.fun;

public class ThredDemo implements Runnable {
    public static void main(String[] args) {
        Runnable r= new ThredDemo();
        Thread tr =new Thread(r,"Thread");
        tr.start();
        String st=tr.getName();
        System.out.println(st);

    }
    public void run()
    {
        System.out.println("Thread is Running...");
        System.out.println("Thread is run..");
    }
}
