package com.code.java8.methodrefrence;

/**
 * Created by Himangshu Gorai on 1/11/2022.
 */


public interface Doable {
    default void doIt(){
        System.out.println("Do it now");
    }
}
