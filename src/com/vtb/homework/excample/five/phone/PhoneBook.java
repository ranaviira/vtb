package com.vtb.homework.excample.five.phone;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private static List<Contact> contactList = new ArrayList<>();

    public static void add(Contact contact) {
        contactList.add(contact);
    }
    public static void getContact(String surname) {
        for(Contact contact: contactList){
            if(contact.surname.equals(surname)){
                System.out.println(contact);
            }
        }
    }
}
