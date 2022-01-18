package com.code.java8.sema;

import java.util.concurrent.Semaphore;

/**
 * Created by Himangshu Gorai on 1/13/2022.
 */
public enum SemaphoreEnum {
    Instance;
    private Semaphore semaphore = new Semaphore(3, true);

    public void download() {

        try {
            semaphore.acquire();
            downloadData();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }

    }

    private void downloadData() {
        try {
            System.out.println("Downloading data from the thread");
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
