package javaLevel2.lesson2;

public class Main {

    public static void main(String[] args) {
        String[][] values = {
                {"1", "1", "1",  "1"},
                {"1", "1", "1",  "1"},
                {"1", "1", "QQ",  "1"},
                {"1", "1", "1",  "1"}
        };

        DigitCalculator calculator = new DigitCalculator();
        System.out.println(calculator.calculation(values));
    }

}
