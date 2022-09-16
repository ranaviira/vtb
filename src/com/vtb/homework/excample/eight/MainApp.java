package com.vtb.homework.excample.eight;

import java.util.*;
import java.util.stream.IntStream;

public class MainApp {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Job");
        arrayList.add("Parrot");
        arrayList.add("Hello");
        arrayList.add("Device");
        arrayList.add("Job");
        arrayList.add("Job");
        arrayList.add("Job");
        arrayList.add("Device");
        arrayList.add("Device");
        arrayList.add("Hello");

        Set<String> setList = new HashSet<>();
        List<String> list = arrayList.stream().filter(n -> !setList.add(n)).distinct().toList();
        System.out.println(list);

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("John", 28, 5000));
        personList.add(new Person("Liza", 34, 6500));
        personList.add(new Person("Elza", 19, 3545));
        personList.add(new Person("Renat", 38, 8000));

        OptionalDouble optionalDouble = personList.stream().mapToInt(e -> e.getSalary()).average();
        System.out.println(optionalDouble);

        personList.stream().filter(x -> x.getAge() > 30).forEach(System.out::println);


    }

}
