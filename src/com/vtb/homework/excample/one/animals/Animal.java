package com.vtb.homework.excample.one.animals;

public class Animal {
    public static int animalsCount = 0;

    String type;
    String name;
    int maxLengthRun;
    int maxLengthSwim;

    public Animal(String type, String name, int maxLengthRun, int maxLengthSwim) {
        animalsCount++;
        this.type = type;
        this.name = name;
        this.maxLengthRun = maxLengthRun;
        this.maxLengthSwim = maxLengthSwim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxLengthRun() {
        return maxLengthRun;
    }

    public void setMaxLengthRun(int maxLengthRun) {
        this.maxLengthRun = maxLengthRun;
    }

    public int getMaxLengthSwim() {
        return maxLengthSwim;
    }

    public void setMaxLengthSwim(int maxLengthSwim) {
        this.maxLengthSwim = maxLengthSwim;
    }

    public void run(int lengthRun) {
        if (lengthRun <= maxLengthRun) {
            System.out.println(type + " " + name + " coped with the cross");
        } else {
            System.out.println(type + " " + name + " couldn't cope with the cross");
        }
    }

    public void swim(int lengthSwim) {
        if (lengthSwim == 0) {
            System.out.println(type + " " + name + " can't swim");
            return;
        }
        if (lengthSwim <= maxLengthSwim) {
            System.out.println(type + " " + name + " coped with the swim");
        } else {
            System.out.println(type + " " + name + " couldn't cope with the swim");
        }
    }
}
