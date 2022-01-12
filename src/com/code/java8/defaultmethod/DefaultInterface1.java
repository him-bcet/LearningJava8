package com.code.java8.defaultmethod;

/**
 * Created by Himangshu Gorai on 1/11/2022.
 */
public interface DefaultInterface1 {

    default void print() {
        System.out.println("Default Interface1");
    }

    static int add(int a, int b) {
        return a + b;
    }
}
