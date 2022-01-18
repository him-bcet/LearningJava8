package com.code.java8.blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by Himangshu Gorai on 1/18/2022.
 */
public class RemoveWorker implements Runnable {
    private BlockingQueue<Integer> queue;

    public RemoveWorker(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Integer take = queue.take();
                System.out.println("Taking the value from the queue " + take);
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
