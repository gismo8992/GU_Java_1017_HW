package javaLevel2.lesson4;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task #1");
        doTask1();
        System.out.println("");
        System.out.println("Task #2");
        doTask2();
        System.out.println("");
        System.out.println("Task #3");
        doTask3();
        System.out.println("Task #4");
        doTask4();
    }

    static void doTask1() {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        list.forEach(s -> System.out.print(s + " "));
    }

    static void doTask2() {
        Set<String> mySet = Set.of("X", "Y", "Z");
        forItem(mySet, s -> System.out.print(s + " "));
    }

    static void doTask3() {
        System.out.println(doubleUp(7, () -> 3));
    }

    static void doTask4() {
        System.out.println(findAllChars("hello", 'l').get());
    }

    static void forItem(Set<String> values, Consumer<String> consumer) {
        Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            consumer.accept(s);
        }
    }

    static int doubleUp(int value, Supplier<Integer> supplier)  {
        return value * supplier.get();
    }

    static Optional<String> findAllChars(String target, char toFind) {
        char[] chars = target.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == toFind) {
                sb.append(chars[i]);
            }
        }
        if(sb.length() > 0) {
            return Optional.of(sb.toString());
        }
        return Optional.empty();
    }
}
