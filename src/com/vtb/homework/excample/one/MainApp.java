package com.vtb.homework.excample.one;

import com.vtb.homework.excample.one.animals.Animal;
import com.vtb.homework.excample.one.animals.Dog;
import com.vtb.homework.excample.one.animals.HomeCat;
import com.vtb.homework.excample.one.animals.Tiger;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        Dog dog = new Dog("Bobic", 500, 10);
        HomeCat cat = new HomeCat("Barsik", 200);
        Tiger tiger = new Tiger("Timon", 300, 50);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(dog);
        animalList.add(cat);
        animalList.add(tiger);

        for (Animal animal : animalList) {
            animal.run(800);
            animal.swim(40);
        }
        System.out.println("total animals in the list - " + Animal.animalsCount);
        System.out.println("total dogs in the list - " + Dog.dogsCount);
        System.out.println("total dogs in the list - " + Tiger.tigersCount);
    }
}
