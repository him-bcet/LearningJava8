package com.code.java8.sema;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Himangshu Gorai on 1/13/2022.
 */
public class SemaphoreApp {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 12; i++) {
            executorService.execute(SemaphoreEnum.Instance::download);
        }
    }
}
