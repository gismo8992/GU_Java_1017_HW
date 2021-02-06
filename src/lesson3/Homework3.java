package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {
        guessNumber();
    }

    static void guessNumber() {
        while (true) {
            int maxTryCount = 3;
            int tryCount = 0;
            Random newRandom = new Random();
            int randomNumber = newRandom.nextInt(10);
            while (true) {
                System.out.println("Попробуйте угадать число от 0 до 10");
                tryCount++;
                Scanner scanerAnswer = new Scanner(System.in);
                if (tryCount > maxTryCount) {
                    System.out.println("Попытки закончились, игра завершена. Повторить игру еще раз?");
                    break;
                }
                int userAnswer = scanerAnswer.nextInt();
                if (userAnswer == randomNumber) {
                    System.out.println("Вы угадали загаданное число. Повторить игру еще раз?");
                    break;
                }
                else if (userAnswer > randomNumber) System.out.println("Вы ввели слишком большое число.");
                else if (userAnswer < randomNumber) System.out.println("Вы ввели слишком маленькое число.");
            }
            Scanner game = new Scanner(System.in);
            int answer = game.nextInt();
            if (answer == 0) break;
        }
    }
}
