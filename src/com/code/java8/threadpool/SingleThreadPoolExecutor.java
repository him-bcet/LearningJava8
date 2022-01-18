package com.code.java8.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Himangshu Gorai on 1/13/2022.
 */
public class SingleThreadPoolExecutor {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 5; i++) {
            service.execute(new WorkerTask(i));
        }
    }
}
