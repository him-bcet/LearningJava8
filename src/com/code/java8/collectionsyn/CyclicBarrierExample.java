package com.code.java8.collectionsyn;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Himangshu Gorai on 1/18/2022.
 */
public class CyclicBarrierExample {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);

        CyclicBarrier barrier = new CyclicBarrier(5, () -> {
            System.out.println("All tasks have finished");
        });

        for (int i = 1; i <= 5; i++) {
            service.execute(new BarrierWorker(i, barrier));
        }

        service.shutdown();
    }
}
