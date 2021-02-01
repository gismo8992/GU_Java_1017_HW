package lesson2;

import java.util.Arrays;

public class Homework2 {

    public static void main(String[] args) {

        changeArray(); // Задача 1. Изменяет каждый элемент массива 0 на 1, а 1 на 0 (элементы массива равны 0 или 1).
        createArray(); // Задача 2. Создает массив с помощью цикла.
        multiplcivationWithConditions(); // Задача 3. Умножает элемент массива <6 на 2.
        toFillArray(); // Задача 4. Заполняет квадрытный двумерный массив по диагонали единицами.
        minAndMaxInArray(); // Задача 5. Находит min и max элементы в массиве.
        int[] arrayForCheck = {1, 8, 3, 5};
        int index = 1;
        System.out.println(checkArray(arrayForCheck)); // Задача 6. Сравнивает сумму левой и правой части массива.
        displaceArray(arrayForCheck, index); // Задача 7. Смещает массив на заданное количество шагов. пока не готово).

    }

    static void changeArray() {
        int[] array = {0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1}; // выделили 52 байта памяти для массива
        for (int i = 0; i < array.length; i++ ) {
            if (array[i] == 0) array[i] = 1;
            else array[i] = 0;
        }
        System.out.println(Arrays.toString(array)); // проверка созданного массива в консоли
        /*for (int a:array) {
            System.out.print(a + " ");
        }*/
    }

    static void createArray() {
        int[] newArray = new int[8]; // добавить значения 0 3 6 9 12 15 18 21
        for(int i = 1; i < newArray.length; i++) {
            newArray[i] = 3 * i;
        }
        System.out.println(Arrays.toString(newArray)); // проверка созданного массива в консоли
        /*for (int a: newArray) {
            System.out.print(a + " ");
        }*/
    }

    static void multiplcivationWithConditions() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // выделили 48 байтов памяти для массива
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 6) array[i] = array[i] * 2;
        }
        System.out.println(Arrays.toString(array)); // проверка созданного массива в консоли
        /*for (int b: array) {
            System.out.print(b + " ");
        }*/
    }

    static void toFillArray() {
        int[][] twoDimensionalArray  = new int[5][5];
        /* { Шаблон массива
        {1, 0, 0, 0, 1}
        {0, 1, 0, 1, 0}
        {0, 0, 1, 0, 0}
        {0, 1, 0, 1, 0}
        {1, 0, 0, 0, 1}
        }
         */
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                if (i == j || j == (twoDimensionalArray.length - 1 - i)) {
                    twoDimensionalArray[i][j] = 1;
                    System.out.print(twoDimensionalArray[i][j] + "\t"); // строка для вывода значения массива в консоль.
                }
                else {
                    System.out.print(twoDimensionalArray[i][j] + "\t"); // строка для вывода значения массива в консоль.
                }
            }
            System.out.println();
        }
    }

    static void minAndMaxInArray() {
        int[] array = {2, 7, 8, 1, 6, 4, 78, 14, 2, -7, 55, 3, -4, 43};
        int max = array[0];
        for (int i = 1; i < array.length; i++) { // ищет максимум
            if (array[i] > max) max = array[i];
        }
        System.out.println("Элемент массива с максимальным значеним: " + max);
        int min = array[0];
        for (int i = 1; i < array.length; i++) { // ищет минимум
            if (array[i] < min) min = array[i];
        }
        System.out.println("Элемент массива с минимальным значеним: " + min);
    }

    static boolean checkArray(int[] array) {
        // {1, 1, 3, 5}
        int sum1 = 0;
        for(int i = 0; i < array.length; i++) {
            int sum2 = 0;
            sum1 = sum1 + array[i];
            for (int k = (i + 1); k < array.length; k++) {
                sum2 = sum2 + array[k];
            }
            if (sum1 == sum2) return true;
        }
        return false;
    }

    static void displaceArray(int[] array, int move) {
        // {3, 1, 5, 9} --> {9, 3, 1, 5} при move = 1
    }
}
