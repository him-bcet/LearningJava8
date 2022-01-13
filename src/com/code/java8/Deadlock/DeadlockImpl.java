package com.code.java8.Deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Himangshu Gorai on 1/13/2022.
 */
public class DeadlockImpl {
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();


    public static void main(String[] args) {
        DeadlockImpl deadlock = new DeadlockImpl();
        new Thread(deadlock::worker1, "Worker1").start();
        new Thread(deadlock::worker2, "Worker2").start();

    }


    public void worker1() {
        lock1.lock();
        System.out.println("Worker1 acquired lock1....");

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        lock2.lock();
        System.out.println("Worker1 acquired lock2...");


        lock1.unlock();
        lock2.unlock();

    }

    public void worker2() {
        lock2.lock();
        System.out.println("Worker2 acquired lock2....");

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        lock1.lock();
        System.out.println("Worker1 acquired lock1...");


        lock1.unlock();
        lock2.unlock();
    }
}
