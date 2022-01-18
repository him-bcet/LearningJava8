package com.code.java8.collectionsyn;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by Himangshu Gorai on 1/18/2022.
 */
public class BarrierWorker implements Runnable {
    private int id;
    private Random random;
    private CyclicBarrier barrier;

    public BarrierWorker(int id, CyclicBarrier barrier) {
        this.id = id;
        this.barrier = barrier;

        this.random = new Random();
    }

    @Override
    public void run() {
        doWork();

    }

    private void doWork() {
        System.out.println("Thread with Id "+this.id+" starts the work...");

        try {
            Thread.sleep(this.random.nextInt(3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            this.barrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
