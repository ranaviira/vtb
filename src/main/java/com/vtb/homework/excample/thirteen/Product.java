package com.vtb.homework.excample.thirteen;

import lombok.Data;

@Data
public class Product {

    int id;
    String title;
    int cost;

    public Product(int id, String title, int cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }
}
