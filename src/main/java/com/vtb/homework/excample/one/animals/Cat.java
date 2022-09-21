package com.vtb.homework.excample.one.animals;

public abstract class Cat extends Animal {
    public static int catsCount;

    public Cat(String type, String name, int maxLengthRun, int maxLengthSwim) {
        super(type, name, maxLengthRun, maxLengthSwim);
        catsCount++;
    }
}
