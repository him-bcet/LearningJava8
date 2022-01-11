package com.code.java8.methodrefrence;

/**
 * Created by Himangshu Gorai on 1/11/2022.
 */
public class FunctionalInterfaceImpl  implements Printable{
    @Override
    public void print() {
        System.out.println("Hi functional interface");
    }

    @Override
    public void doIt() {
        System.out.println("Do it from Implementation");
    }

    public static void main(String[] args) {
        FunctionalInterfaceImpl functionalInterface = new FunctionalInterfaceImpl();
        functionalInterface.print();
        functionalInterface.doIt();
    }
}
