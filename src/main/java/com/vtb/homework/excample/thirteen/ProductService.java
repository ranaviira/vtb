package com.vtb.homework.excample.thirteen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductService {

    List<Product> list = new ArrayList<>();

    {
        list.add(new Product(1, "Milk", 5));
        list.add(new Product(2, "Cheese", 6));
        list.add(new Product(3, "Beer", 12));
        list.add(new Product(4, "Bred", 33));
        list.add(new Product(5, "Eggs", 23));
        list.add(new Product(6, "Potato", 41));
        list.add(new Product(7, "Tee", 23));
    }


    public void printAll() {
        System.out.println(list);
    }

    public Product findByTitle(String title) {
        for (Product product : list) {
            if (product.title.equals(title)) {
                return product;
            }
        }
        return null;
    }
}
