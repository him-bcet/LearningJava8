package com.code.java8.dijakstra;

import java.util.Random;

/**
 * Created by Himangshu Gorai on 1/18/2022.
 */
public class Philosopher implements Runnable {
    private int id;
    private volatile boolean full;
    private Chopstick leftChopstick;
    private Chopstick rightChopstick;
    private Random random;
    private int eatingCounter;

    public Philosopher(int id, Chopstick leftChopstick, Chopstick rightChopstick) {
        this.id = id;
        this.leftChopstick = leftChopstick;
        this.rightChopstick = rightChopstick;

        this.random = new Random();
    }

    @Override
    public void run() {
        try {
            while (!full) {
                think();

                if (leftChopstick.pickUp(this, State.LEFT)) {
                    if (rightChopstick.pickUp(this, State.RIGHT)) {
                        eat();

                        rightChopstick.putDown(this, State.LEFT);
                    }
                    leftChopstick.putDown(this, State.RIGHT);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void think() throws InterruptedException {
        System.out.println(this + " is thinking...");
        Thread.sleep(random.nextInt(1000));
    }

    private void eat() throws InterruptedException {
        System.out.println(this + " is eating...");
        eatingCounter++;
        Thread.sleep(random.nextInt(1000));

    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    @Override
    public String toString() {
        return "Philosopher " + id;
    }

    public int getEatingCount() {
        return this.eatingCounter;
    }
}
