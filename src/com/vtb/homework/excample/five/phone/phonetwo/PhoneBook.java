package com.vtb.homework.excample.five.phone.phonetwo;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    static Map<String, Integer> stringIntegerMap = new HashMap<>();

    public static void main(String[] args) {
        add("Jones", 4564);

        get("Jones");

    }

    public static void add(String surname, Integer number){
        stringIntegerMap.put(surname, number);
    }

    public static void get(String surname){
        System.out.println(stringIntegerMap.get(surname));
    }
}
