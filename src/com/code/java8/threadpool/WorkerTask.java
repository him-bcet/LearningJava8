package com.code.java8.threadpool;

import java.util.concurrent.TimeUnit;

/**
 * Created by Himangshu Gorai on 1/13/2022.
 */
public class WorkerTask implements Runnable {
    private int id;

    public WorkerTask(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Task with id : " + this.id + " and Thread with id : " + Thread.currentThread().getName());
        long duration = (long) (Math.random() * 5);
        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
