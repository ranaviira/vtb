package com.vtb.homework.excample.five;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainApp {

    public static void main(String[] args) {
        String[] array = {
                "Hello",
                "Potato",
                "Rain",
                "Car",
                "Monkey",
                "Guitar",
                "Potato",
                "Hello",
                "PC",
                "Hello"

        };

        Set<String> set = new HashSet<>(Arrays.asList(array));
        System.out.println(set);

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            String o = iterator.next();
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (o.equals(array[i])) {
                    count++;
                }
            }
            System.out.println(o + " - " + count);
        }
    }
}
