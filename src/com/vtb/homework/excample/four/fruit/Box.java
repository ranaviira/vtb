package com.vtb.homework.excample.four.fruit;

public class Box {
    int count;
    float weight;

    public Box(int count, float weight) {
        this.count = count;
        this.weight = weight;
    }

    public boolean compare(Box box) {
        return this.count * this.weight == box.count * box.weight;
    }

    public void pourOverTheFruit(Box box){
        this.count = this.count + box.count;
        box.count = 0;
    }
}
