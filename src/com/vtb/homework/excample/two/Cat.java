package com.vtb.homework.excample.two;

public class Cat implements RunAndJump {

    private String name;
    private int maxLengthRun;
    private int maxHeightJump;

    public Cat(String name, int maxLengthRun, int maxHeightJump) {
        this.name = name;
        this.maxLengthRun = maxLengthRun;
        this.maxHeightJump = maxHeightJump;
    }

    @Override
    public boolean run(int length) {
        if (length > maxLengthRun) {
            return false;
        }
        System.out.println("the cat " + name + " overcame this cross");
        return true;
    }

    @Override
    public boolean jump(int height) {
        if (height > maxHeightJump) {
            return false;
        }
        System.out.println("the cat " + name + " overcame this wall");
        return true;
    }
}

