package com.vtb.homework.excample.ten;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import java.util.List;


@Entity
@Table(name = "persons")
public class Person {
    @Id
    @jakarta.persistence.Column
    private int id;

    @Column
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @OneToMany(mappedBy = "person_id", fetch = FetchType.EAGER)
    private List<ProductsByPerson> personList;

    public List<ProductsByPerson> getPersonList() {
        return personList;
    }

    public void setPersonList(List<ProductsByPerson> personList) {
        this.personList = personList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Person() {
    }
}
