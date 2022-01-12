package com.code.java8.comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by Himangshu Gorai on 1/11/2022.
 */
public class MinMaxComparatorImp {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(15);
        list.add(10);
        list.add(20);
        list.add(47);
        list.add(26);


        Optional<Integer> min = list.stream().min(Integer::compareTo);
        Optional<Integer> max = list.stream().max((p1, p2) -> p2.compareTo(p1));

        System.out.println(min.get());
        System.out.println(max.get());


    }
}
