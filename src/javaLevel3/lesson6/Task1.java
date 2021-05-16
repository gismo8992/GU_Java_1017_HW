package javaLevel3.lesson6;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {

    }

    public static int[] afterLastFour(int[] inputArr) throws RuntimeException {
        int n = 0;
        String str = Arrays.toString(inputArr);
        if (str.indexOf(String.valueOf(4)) != -1) {
            for (int i = 0; i < inputArr.length; i++) {
                if (inputArr[i] == 4) n = i;
            }
            int[] arr1 = new int[inputArr.length - n - 1];
            System.arraycopy(inputArr, n + 1, arr1, 0, arr1.length);
            return arr1;
        } else {
            throw new RuntimeException("Цифра 4 в массиве не найдена");
        }
    }

}
