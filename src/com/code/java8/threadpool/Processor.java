package com.code.java8.threadpool;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by Himangshu Gorai on 1/13/2022.
 */
public class Processor implements Callable<String> {
    private int id;

    public Processor(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        TimeUnit.SECONDS.sleep(2);
        return "Id: " + id;
    }
}
