package com.code.java8.comparator;

import java.util.stream.Stream;

/**
 * Created by Himangshu Gorai on 1/11/2022.
 */
public class OfStream {
    public static void main(String[] args) {
        Stream.of(23, 4, 56, 89).forEach(System.out::println);

        String[] names = {"Himangshu", "Mohan", "Ram", "Sita"};

        long count = Stream.of(names).filter(name -> name.length() > 5).count();
        System.out.println("Total names " + count);
    }
}
