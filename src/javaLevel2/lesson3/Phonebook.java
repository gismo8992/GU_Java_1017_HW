package javaLevel2.lesson3;

import java.util.*;

public class Phonebook {
    private final Map<String, Set<String>> book;

    public Phonebook() {
        this.book = new HashMap<>();
    }

    public void add(String name, String number) {
        Set<String> numbers = book.getOrDefault(name, new HashSet<>());
        numbers.add(number);
        book.putIfAbsent(name, numbers);

        /*if(book.containsKey(name)) {   // длинный вариант
            book.get(name).add(number);
        }
        else {
            Set<String> numbers = new HashSet<>();
            numbers.add(number);
            book.put(name, numbers);
        }*/

    }

    public Set<String> get(String name) {
        return book.getOrDefault(name, Collections.EMPTY_SET);
    }
}
