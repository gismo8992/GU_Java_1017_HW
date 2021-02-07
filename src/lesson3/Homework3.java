package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {

        guessNumber();
        doRecursiveWalk();
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
                if (userAnswer > randomNumber) System.out.println("Вы ввели слишком большое число.");
                else if (userAnswer < randomNumber) System.out.println("Вы ввели слишком маленькое число.");
                else {
                    System.out.println("Вы угадали загаданное число. Повторить игру еще раз?");
                    break;
                }
            }
            Scanner game = new Scanner(System.in);
            int answer = game.nextInt();
            if (answer == 0) break;
        }
    }

    static void playGame() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        int randIndex = random.nextInt(words.length);

        String randWord = words[randIndex];
        System.out.println("Rand word: " + randWord);

        checkWord(randWord);
    }

    static void checkWord(String randWord) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your word...");
        String userWord = scanner.next();

        if (randWord.equals(userWord)) {
            System.out.println("Congrats!!! You are winner!");
            return;
        }

        for (int i = 0; i < randWord.length() && i < userWord.length(); i++) {
            if (randWord.charAt(i) == userWord.charAt(i)) {
                System.out.print(randWord.charAt(i));
            } else {
                System.out.print('#');
            }
        }
        System.out.print("########################");

        System.out.println("\nGuess word is not equal to PC's word.");
        System.out.println("Try again.");

        checkWord(randWord);
    }


    static void doRecursiveWalk() {
        int[] digits = {1, 4, 6, 7, 8};
        arrayWalk(digits, 0);
    }

    static void arrayWalk(int[] digits, int index) {
        if (index == digits.length) {
            return;
        }
        System.out.printf("[%s] => %s %n", index, digits[index]);
        arrayWalk(digits, ++index);
    }
}
