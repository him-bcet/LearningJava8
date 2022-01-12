package com.code.java8.defaultmethod;

/**
 * Created by Himangshu Gorai on 1/11/2022.
 */
public class DefaultInterfaceImpl implements DefaultInterface1, DefaultInterface2 {
    @Override
    public void print() {
        DefaultInterface1.super.print();

    }


    public static void main(String[] args) {
        DefaultInterfaceImpl impl = new DefaultInterfaceImpl();
        impl.print();
    }
}
