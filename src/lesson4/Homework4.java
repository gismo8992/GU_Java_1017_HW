package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        playGame();
        /*
        createSquareSpace(int columne, int row) {  // Функция для создания поля с заданным количеством столбцов с строк (строка 131)
         */
    }

    static void playGame() {
        char[][] field = createFiled();
        drawField(field);

        while (true) {
            if (!checkNextPlayerMove(field)) {
                return;
            }
            if (!checkNextAIMove(field)) {
                return;
            }
        }
    }

    static boolean checkNextPlayerMove(char[][] field) {
        doPlayerMove(field);
        drawField(field);
        return isNextMoveAvailable(field, 'X', "Congrats! You are winner!");
    }

    static boolean checkNextAIMove(char[][] field) {
        doAIMove(field);
        drawField(field);
        return isNextMoveAvailable(field, 'O', "Sorry, AI is winner!");
    }

    static boolean isNextMoveAvailable(char[][] field, char sign, String winMessage) {
        if(isDraw(field)) {
            System.out.println("There is draw detected. Finish!");
            return false;
        }
        if (isWin(field, sign)) {
            System.out.println(winMessage);
            return false;
        }
        return true;
    }

    static boolean isDraw(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isWin(char[][] field, char sign) {

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length - 2; j++) {
                if (field[i][j] == sign && field[i][j+1] == sign && field[i][j+2] == sign) return true;
                if (field[j][i] == sign && field[j+1][i] == sign && field[j+2][i] == sign) return true;
            }
        }
        if(field[0][0] == sign && field[1][1] == sign && field[2][2] == sign) return true;
        if(field[0][2] == sign && field[1][1] == sign && field[2][0] == sign) return true;
        return false;
    }

    static void doPlayerMove(char[][] field) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        do{
            y = checkCoordinateRange(scanner, 'y');
            x = checkCoordinateRange(scanner, 'x');
        }
        while (isCelFree(field, y, x));
        field[y][x] = 'X';
    }

    static int checkCoordinateRange(Scanner scanner, char coordName) {
        int val;
        do{
            System.out.printf("Please input %s-coordinate in range [1-3]: %n", coordName);
            val = scanner.nextInt() - 1;
        }
        while (val < 0 || val > 2);
        return val;
    }

    static void doAIMove(char[][] field) {
        Random random = new Random();
        int x, y;
        do{
            x = random.nextInt(field.length);
            y = random.nextInt(field.length);
        }
        while (isCelFree(field, y, x));
        field[y][x] = 'O';
    }

    static boolean isCelFree(char[][] field, int y, int x) {
        return field[y][x] != '-';
    }

    static char[][] createFiled() {
        return new char[][] {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };
    }

    static void drawField(char field[][]) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        /*
        static void createSquareSpace(int columne, int row) {  // Функция для создания поля с заданным количеством столбцов с строк
            char[][] space = new char[row][columne];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < columne; j++) {
                    System.out.print(" - ");
                }
                System.out.println();
            }
        }
         */

    }
}
