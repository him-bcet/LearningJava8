package com.code.java8.optional;

import java.util.Optional;

/**
 * Created by Himangshu Gorai on 1/11/2022.
 */
public class OptionalExample {
    public static void main(String[] args) {
        String[] str = new String[10];

        Optional<String> optional = Optional.ofNullable(str[5]);

        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("No element is present.");
        }
    }
}
