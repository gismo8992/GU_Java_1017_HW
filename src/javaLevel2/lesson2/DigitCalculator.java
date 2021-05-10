package javaLevel2.lesson2;

public class DigitCalculator {
    public int calculation(String[][] values) {

        checkArraySizeException(values.length);

        for (int i = 0; i < values.length; i++) {
            checkArraySizeException(values[i].length);
        }

        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                try {
                    sum += Integer.parseInt(values[i][j]);
                    System.out.println(sum);
                } catch (IllegalArgumentException e) {
                    String message = String.format("Array[%s][%s] must contain parsable digits only", i, j);
                    throw new MyDataArrayException(message, e);
                }
            }
        }
        return sum;
    }

    private void checkArraySizeException(int length){
        if (length != 4) {
            throw new MyArraySizeException("Size array must be only 4.");
        }
    }
}