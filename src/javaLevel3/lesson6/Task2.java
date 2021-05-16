package javaLevel3.lesson6;

public class Task2 {
    public static void main(String[] args) {
    }

    public static boolean onlyOneAndFour(int[] arr) {
        boolean v_1 = false, v_4 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) v_1 = true;
            else if (arr[i] == 4) v_4 = true;
            else return false;
        }
        return v_1 && v_4;
    }
}
