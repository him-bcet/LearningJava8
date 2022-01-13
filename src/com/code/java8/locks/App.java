package com.code.java8.locks;

/**
 * Created by Himangshu Gorai on 1/12/2022.
 */
public class App {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Thread t1 = new Thread(() -> {
            try {
                worker.producer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                worker.consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


