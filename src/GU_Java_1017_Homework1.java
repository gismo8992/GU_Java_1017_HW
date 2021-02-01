import java.util.Arrays;
public class GU_Java_1017_Homework1 {
    public static void main (String[] args) {
        byte a0 = 127;
        short a1 = 190;
        int a = 1000;
        long b = 2;
        float c = 1.5f;
        double d = 1.93234;
        char symbol = 'c';
        String str = "Hello, world!";
        boolean isSomething = true;

        System.out.println(expression());
        System.out.println(compareSum(5, 7));
        positiveOrNegativeStr(-4);
        System.out.println(positiveOrNegativeBool(-4));
        personalGreeting("Ivan");
        isLeapYear(2000);
    }

    static float expression() {
        float a = 1.5f;
        float b = 1.39f;
        float c = 4.93f;
        float d = 5.31f;
        float result = a * (b + (c / d));
        return result;
    }

    static boolean compareSum(int a, int b) {
        int sum = a + b;
        return  (sum >= 10 && sum <= 20);
    }

    static void positiveOrNegativeStr(int v) {
        if(v >= 0) {
            System.out.println("Положительное число ввели вы.");
        }
        else {
            System.out.println("Отрицательное число ввели вы.");
        }
    }

    static boolean positiveOrNegativeBool(int m) {
        return m >= 0;
    }

    static void personalGreeting (String name) {
        System.out.println("Привет, " + name + "!");
    }

    static void isLeapYear (int year) {
        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Год високосный.");
        }
        else System.out.println("Год не високосный.");
    }
}
