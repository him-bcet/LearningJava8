package com.code.java8.programming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by Himangshu Gorai on 1/12/2022.
 */
public class DuplicateElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,80,10,15,80,80,15);

        Set<Integer> set = new HashSet<>();

        list.stream().filter(ele-> !set.add(ele)).collect(Collectors.toSet()).forEach(System.out::println);
    }
}
