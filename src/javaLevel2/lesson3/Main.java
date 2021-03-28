package javaLevel2.lesson3;

public class Main {
    public static void main(String[] args) {

        Phonebook phoneBook = new Phonebook();

        phoneBook.add("Cole", "1234567");
        phoneBook.add("Johnson", "9876543");
        phoneBook.add("Black", "2348723");
        phoneBook.add("Cole", "7645322");
        phoneBook.add("Tramp", "6666666");


        System.out.println(phoneBook.get("Cole"));

        phoneBook.add("Tramp", "7777777");

        System.out.println(phoneBook.get("Tramp"));


    }
}
