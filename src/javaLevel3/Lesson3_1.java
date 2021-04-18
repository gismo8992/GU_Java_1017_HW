package javaLevel3;

import java.util.Arrays;

public class Lesson3_1 {
    public static void main(String[] args) {
        Integer[] arr = {2, 6, 22, 11}; // Task 1
        ChangePositionOfElementsInArray<Integer> myChange = new ChangePositionOfElementsInArray<>(arr);
        System.out.println(Arrays.toString(myChange.reverseElements(0, 3)));

        String[] arr1 = {"sf", "saa", "wef"}; // Task 2
        ConvertArrayInArrayList<String> myConvert = new ConvertArrayInArrayList<>(arr1);
        System.out.println(myConvert.convert());
    }
}
