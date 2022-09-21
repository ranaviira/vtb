package com.vtb.homework.excample.one.animals;

public class HomeCat extends Cat {
    public static int homeCatCount;

    public HomeCat(String name, int maxLengthRun) {
        super("HomeCat", name, maxLengthRun, 0);
        homeCatCount++;
    }
}
