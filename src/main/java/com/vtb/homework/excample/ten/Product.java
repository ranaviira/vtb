package com.vtb.homework.excample.ten;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.util.List;


@Entity
@Table(name = "products")
public class Product {

    @Id
    @Column
    private int id;

    @jakarta.persistence.Column
    private String title;

    @jakarta.persistence.Column
    private int price;

    @OneToMany(mappedBy = "product_id", fetch = FetchType.EAGER)
    private List<ProductsByPerson> productsList;

    public List<ProductsByPerson> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<ProductsByPerson> productsList) {
        this.productsList = productsList;
    }

    public Product() {
    }

    public Product(int id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
