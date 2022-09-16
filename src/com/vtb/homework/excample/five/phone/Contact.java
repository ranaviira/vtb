package com.vtb.homework.excample.five.phone;

public class Contact {
    String surname;
    int phoneNumber;

    public Contact(String surname, int phoneNumber) {
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "surname='" + surname + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
