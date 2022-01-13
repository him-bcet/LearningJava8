package com.code.java8.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Himangshu Gorai on 1/12/2022.
 */
public class ReEntrantLockImpl {
    private int counter = 0;
    private Lock lock = new ReentrantLock();

    public static void main(String[] args) {

        ReEntrantLockImpl reEntrantLock = new ReEntrantLockImpl();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                reEntrantLock.increment();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                reEntrantLock.increment();
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

        System.out.println(reEntrantLock.counter);
    }

    public void increment() {
        lock.lock();
        for (int i = 0; i < 10000; i++) {
            counter++;
        }

        lock.unlock();
    }
}
