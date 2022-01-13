package com.code.java8.multithreading;

/**
 * Created by Himangshu Gorai on 1/12/2022.
 */
public class Runner1 implements Runnable {
    @Override
    public void run() {
        for (int i =0;i<10;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

//            Thread.currentThread().interrupt();
            System.out.println("Runner1 :"+i);
        }
    }
}
