package com.code.java8.programming;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Himangshu Gorai on 1/12/2022.
 */
public class FunctionalMultiplierImpl {
    public static void main(String[] args) {
        String str = "Welcome to code decode and code decode welcome you";


        List<String> list = Arrays.asList(str.split(" "));

        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

    }
}
