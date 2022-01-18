package com.code.java8.blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by Himangshu Gorai on 1/18/2022.
 */
public class PutWorker implements Runnable {
    private BlockingQueue<Integer> queue;

    public PutWorker(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            try {
                queue.put(count);
                System.out.println("Putting item value " + count);
                count++;
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
