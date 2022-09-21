package com.vtb.homework.excample.one.animals;

public class Dog extends Animal {
    public static int dogsCount;

    public Dog(String name, int maxLengthRun, int maxLengthSwim) {
        super("Dog", name, maxLengthRun, maxLengthSwim);
        dogsCount++;
    }
}
