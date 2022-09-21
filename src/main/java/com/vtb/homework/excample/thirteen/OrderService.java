package com.vtb.homework.excample.thirteen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderService {
    @Autowired
    Cart cart;

    @Autowired
    ProductService productService;

    public void bayProducts(){
        productService.printAll();
        cart.addProduct("Tee");
        cart.addProduct("Milk");
        cart.addProduct("Beer");
        cart.addProduct("Tee");
        printProductsInCart();

    }

    public void printProductsInCart() {

        List<Product> list = cart.returnCart();
        int priceOrder = 0;
        for (Product product: list){
            priceOrder+= product.cost;
        }
        System.out.println(list);
        System.out.println(priceOrder);
    }
}
