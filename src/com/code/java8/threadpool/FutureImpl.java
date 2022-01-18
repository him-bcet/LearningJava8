package com.code.java8.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Himangshu Gorai on 1/13/2022.
 */
public class FutureImpl {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);

        List<Future<String>> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Future<String> future = service.submit(new Processor(i));
            list.add(future);
        }

        for (Future<String> future : list) {
            System.out.println(future.get());
        }

        service.shutdown();


    }
}
