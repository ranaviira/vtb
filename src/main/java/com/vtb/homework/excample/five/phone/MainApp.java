package com.vtb.homework.excample.five.phone;

public class MainApp {
    public static void main(String[] args) {
        PhoneBook.add(new Contact("Jones", 23656));
        PhoneBook.add(new Contact("Ventura", 8956456));
        PhoneBook.add(new Contact("Smith", 784564));
        PhoneBook.add(new Contact("Smith", 54315649));

        PhoneBook.getContact("Smith");


    }
}
