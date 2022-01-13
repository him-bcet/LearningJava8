package com.code.java8.multithreading;

/**
 * Created by Himangshu Gorai on 1/12/2022.
 */
public class ThreadImplementation {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runner1());
        Thread t2 = new Thread(new Runner2());


        t1.start();
        t2.start();

        try {
            t1.interrupt();
            t1.join();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Finished with the main thread");
    }
}
