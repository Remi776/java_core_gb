package ru.gb.java_core.homework4.enteties;

import java.util.Arrays;

public class Order {

    private Customer customer;
    private Product product;
    private int productCount;

    public Order(Customer customer, Product product, int productCount) {
        this.customer = customer;
        this.product = product;
        this.productCount = productCount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", product=" + product +
                ", productCount=" + productCount +
                '}';
    }
}