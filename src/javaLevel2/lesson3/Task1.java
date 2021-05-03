package javaLevel2.lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String [] args) {

        ArrayList<String> carBrand = new ArrayList<>();
        carBrand.add(0, "Audi");
        carBrand.add(1, "BMW");
        carBrand.add(2, "VW");
        carBrand.add(3, "Reno");
        carBrand.add(4, "Peugeot");
        carBrand.add(5, "Kia");
        carBrand.add(6, "Reno");
        carBrand.add(7, "VW");
        carBrand.add(8, "Mercedes");
        carBrand.add(9, "Skoda");
        carBrand.add(10, "Audi");
        carBrand.add(11, "Fiat");

        Set<String> unique = new HashSet<>(carBrand);
        System.out.printf("Unique words are: %s", unique);
        System.out.println("");

        HashMap<String, Integer> numberBrands = new HashMap<>();
        Integer numberBrand;
        for (String i : carBrand) {
            numberBrand = numberBrands.get(i);
            numberBrands.put(i, numberBrand == null ? 1 : numberBrand + 1);
        }

        System.out.printf("Number of car brand: %s", numberBrands);
    }
}
