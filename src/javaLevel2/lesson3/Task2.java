package javaLevel2.lesson3;

import java.util.HashMap;
import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Cole", 1234567);
        phoneBook.add("Johnson", 9876543);
        phoneBook.add("Black", 2348723);
        phoneBook.add("Cole", 7645322);
        phoneBook.add("Tramp", 6666666);

        phoneBook.get("Cole");

        phoneBook.add("Tramp", 7777777);
    }
}

    class PhoneBook {

    HashMap<String, HashSet<Integer>> phoneBook1;
    PhoneBook() {
        this.phoneBook1 = new HashMap<>();
    }

    void add(String name, int num1) {
        HashSet<Integer> phoneBook = phoneBook1.getOrDefault(name, new HashSet<>());
        phoneBook.add(num1);
        phoneBook1.put(name, phoneBook);
    }

    void get(String name) {
        System.out.printf("%nContact " + name + ": " + phoneBook1.getOrDefault(name, new HashSet<>()));
    }
}
