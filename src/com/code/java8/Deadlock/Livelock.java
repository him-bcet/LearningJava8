package com.code.java8.Deadlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Himangshu Gorai on 1/13/2022.
 */
public class Livelock {
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();


    public static void main(String[] args) throws InterruptedException{
        Livelock livelock = new Livelock();
        new Thread(() -> {
            try {
                livelock.worker1();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Workder1").start();

        new Thread(() -> {
            try {
                livelock.worker2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Workder2").start();
    }


    public void worker1() throws InterruptedException {
        while (true) {
            lock1.tryLock(50, TimeUnit.MILLISECONDS);

            System.out.println("Worker1 acquires the lock1");
            System.out.println("Worker1 tries to acquires the lock2");

            if (lock2.tryLock()) {
                System.out.println("Worker1 acquires the lock2");
                lock2.unlock();
            } else {
                System.out.println("Worker1 could not get the lock2");
                continue;
            }
            break;

        }
        lock1.unlock();
        lock2.unlock();
    }

    public void worker2() throws InterruptedException {
        while (true) {
            lock2.tryLock(50, TimeUnit.MILLISECONDS);

            System.out.println("Worker2 acquires the lock2");
            System.out.println("Worker2 tries to acquires the lock1");

            if (lock1.tryLock()) {
                System.out.println("Worker2 acquires the lock1");
                lock1.unlock();
            } else {
                System.out.println("Worker2 could not get the lock1");
                continue;
            }
            break;

        }
        lock1.unlock();
        lock2.unlock();
    }
}
