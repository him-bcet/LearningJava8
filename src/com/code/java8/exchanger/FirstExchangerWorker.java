package com.code.java8.exchanger;

import java.util.concurrent.Exchanger;

/**
 * Created by Himangshu Gorai on 1/18/2022.
 */
public class FirstExchangerWorker implements Runnable {

    private int counter;
    private Exchanger<Integer> exchanger;

    public FirstExchangerWorker(Exchanger<Integer> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        while (true) {
            counter++;
            System.out.println("First thread increment the counter " + counter);

            try {
                counter = exchanger.exchange(this.counter);
                System.out.println("First thread get the counter "+counter);

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
