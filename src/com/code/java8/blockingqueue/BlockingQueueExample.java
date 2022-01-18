package com.code.java8.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by Himangshu Gorai on 1/18/2022.
 */
public class BlockingQueueExample {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

        PutWorker putWorker = new PutWorker(queue);
        RemoveWorker removeWorker = new RemoveWorker(queue);

        new Thread(putWorker).start();
        new Thread(removeWorker).start();
    }
}
