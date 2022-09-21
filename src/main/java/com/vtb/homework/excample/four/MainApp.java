package com.vtb.homework.excample.four;

import java.util.ArrayList;
import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(changeElementInArray(array, 1, 5)));

        System.out.println(toArrayList(array));

    }

    public static int[] changeElementInArray(int[] array, int a, int b) {
        int[] result = array;
        int x = result[a - 1];
        result[a - 1] = result[b - 1];
        result[b - 1] = x;
        return result;
    }

    public static ArrayList<Integer> toArrayList(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;
    }
}
