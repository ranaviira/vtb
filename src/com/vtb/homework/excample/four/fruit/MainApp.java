package com.vtb.homework.excample.four.fruit;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Box> appleList = new ArrayList<>();
        Box box = new Apple(3);
        Box box1 = new Apple(2);

        System.out.println(box.compare(box1));
        box.pourOverTheFruit(box1);

        System.out.println(box.count);
        System.out.println(box1.count);


        appleList.add(new Apple(4));
        appleList.add(new Apple(8));

        List<Box> orangeList = new ArrayList<>();
        orangeList.add(new Orange(3));
        orangeList.add(new Orange(4));

        getWeight(appleList);
        getWeight(orangeList);
    }

    public static float getWeight(List<Box> boxList) {
        float weightBox = 0;
        for (Box list : boxList) {
            weightBox = list.count * list.weight;
            System.out.println(weightBox);
        }
        return weightBox;
    }
}
