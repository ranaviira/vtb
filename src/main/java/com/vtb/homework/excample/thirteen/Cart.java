package com.vtb.homework.excample.thirteen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Cart {
    public List<Product> cart = new ArrayList<>();

    @Autowired
    ProductService productService;

    public void addProduct(String string) {
        cart.add(productService.findByTitle(string));
    }

    public List <Product> returnCart(){
        return cart;
    }
}
