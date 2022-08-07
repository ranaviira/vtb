package com.vtb.homework.excample.one.animals;

public class Tiger extends Cat {

    public static int tigersCount;

    public Tiger(String name, int maxLengthRun, int maxLengthSwim) {
        super("Tiger", name, maxLengthRun, maxLengthSwim);
        tigersCount++;
    }
}
