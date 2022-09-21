package com.vtb.homework.excample.ten;

import jakarta.persistence.*;


@Entity
@Table(name = "products_by_person")
public class ProductsByPerson {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @jakarta.persistence.Column
    private int person_id;

    @jakarta.persistence.Column
    private int product_id;

    @ManyToOne
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private Person person;

    @ManyToOne
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private Product product;

    public ProductsByPerson() {
    }

    public ProductsByPerson(int person_id, int product_id) {
        this.person_id = person_id;
        this.product_id = product_id;
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    @Override
    public String toString() {
        return "ProductsByPerson{" +
                "id=" + id +
                ", person_id=" + person_id +
                ", product_id=" + product_id +
                '}';
    }
}
