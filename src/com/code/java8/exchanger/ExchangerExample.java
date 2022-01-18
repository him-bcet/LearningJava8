package com.code.java8.exchanger;

import java.util.concurrent.Exchanger;

/**
 * Created by Himangshu Gorai on 1/18/2022.
 */
public class ExchangerExample {
    public static void main(String[] args) {
        Exchanger<Integer> exchanger = new Exchanger<>();

        FirstExchangerWorker firstExchangerWorker = new FirstExchangerWorker(exchanger);
        SecondExchangeWorker secondExchangeWorker = new SecondExchangeWorker(exchanger);

        new Thread(firstExchangerWorker).start();
        new Thread(secondExchangeWorker).start();
    }
}
