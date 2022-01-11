package com.code.java8.functionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Himangshu Gorai on 1/11/2022.
 */
public class LambdaExpressionSortingImpl {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        //Adding Products
        list.add(new Product(1, "Samsung A5", 17000f));
        list.add(new Product(3, "Iphone 6S", 65000f));
        list.add(new Product(2, "Sony Xperia", 25000f));
        list.add(new Product(4, "Nokia Lumia", 15000f));
        list.add(new Product(5, "Redmi4 ", 26000f));
        list.add(new Product(6, "Lenevo Vibe", 19000f));

        Stream<Product> productStream = list.stream().filter(product -> product.getPrice() > 20000);

        productStream.forEach(product -> System.out.println(product.getName() + ":" + product.getPrice()));


    }
}
