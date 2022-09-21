package com.vtb.homework.excample.three;

import com.vtb.homework.excample.three.exeptions.MyArraySizeException;

public class MainApp {
    public static void main(String[] args) throws MyArraySizeException {

        String[][] twoDimArray = {{"5", "7", "3", "17"}, {"7", "0", "1", "9"}, {"2", "1", "2", "3"}, {"3", "1", "2", "3"}};
        System.out.println(checkArraySize(twoDimArray));
    }
    public static int checkArraySize(String[][] strings) throws MyArraySizeException {
        if (!(strings.length == 4
                && strings[0].length == 4
                && strings[1].length == 4
                && strings[2].length == 4
                && strings[3].length == 4)) {
            throw new MyArraySizeException("Неправильный размер массива");
        }

        int[][] parseStringArray = new int[4][4];
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                String s = strings[i][j];

                try {
                    int x = Integer.parseInt(s);
                    parseStringArray[i][j] = x;
                } catch (NumberFormatException e) {
                    throw new MyArraySizeException("В ячейке (" + i + ", " + j + ") массива лежит что-то не то");
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < parseStringArray.length; i++) {
            for (int j = 0; j < parseStringArray[i].length; j++) {
                sum += parseStringArray[i][j];

            }
        }
        return sum;
    }
}
