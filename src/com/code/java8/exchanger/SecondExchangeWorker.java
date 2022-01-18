package com.code.java8.exchanger;

import java.util.concurrent.Exchanger;

/**
 * Created by Himangshu Gorai on 1/18/2022.
 */
public class SecondExchangeWorker implements Runnable {
    private int counter;
    private Exchanger<Integer> exchanger;

    public SecondExchangeWorker(Exchanger<Integer> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        while (true){
            counter--;
            System.out.println("Second thread decrement the counter "+counter);
            try {
                counter = exchanger.exchange(counter);
                System.out.println("Second thread get the counter "+counter);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
