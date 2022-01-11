package com.code.java8.methodrefrence;

/**
 * Created by Himangshu Gorai on 1/11/2022.
 */
public class MethodRefImpl {

    public static void main(String[] args) {
        Sayable sayable = MethodRefImpl::saySomething;


        sayable.say();
    }

    public static void saySomething() {
        System.out.println("Hello this is a static method");
    }
}
