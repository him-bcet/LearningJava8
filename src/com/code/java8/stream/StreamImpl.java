package com.code.java8.stream;

import com.code.java8.functionalInterface.Product;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Himangshu Gorai on 1/11/2022.
 */
public class StreamImpl {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));


        Map<Integer, String> collect = productsList.stream().collect(Collectors.toMap(Product::getId, Product::getName));

        for (Map.Entry<Integer, String> entry : collect.entrySet()) {
            System.out.println(entry.getKey()+":"+ entry.getValue());
        }
    }
}
