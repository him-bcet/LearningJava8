package com.code.java8.locks;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Himangshu Gorai on 1/12/2022.
 */
public class Worker {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void producer() throws InterruptedException {

        lock.lock();
        System.out.println("In the producer");

        condition.await();
        System.out.println("Again in the producer method");

        lock.unlock();
    }


    public void consumer() throws InterruptedException {
        Thread.sleep(2 * 1000);

        lock.lock();
        System.out.println("In the consumer method");

        condition.signal();
        Thread.sleep(3 * 1000);
        lock.unlock();

    }
}
