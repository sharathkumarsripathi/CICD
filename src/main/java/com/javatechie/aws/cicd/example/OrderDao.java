package com.javatechie.aws.cicd.example;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderDao {


    public List<Order> getOrders() {
        return Stream.of(
                new Order(100, "CUSTOMER1"),
                new Order(101, "CUSTOMER2"),
                new Order(102, "CUSTOMER3"),
                new Order(103, "CUSTOMER4"))
                .collect(Collectors.toList());
    }
}
