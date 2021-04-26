package javaLevel2.lesson7.client;

import java.io.*;
import java.util.ArrayDeque;
import java.util.function.Consumer;

public class LocalHistory {
    private static final String historyFile = "localHistory.txt"; // файл с историей

    public static void writeToFile (String historyLine) { // добавляем строку с историей в созданный файл
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(historyFile,true))) {
            bw.append(historyLine).append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void restoreLast (int linesNumber, Consumer<String> consumer) {  // читаем строки, сохраняем заданное количество
        ArrayDeque<String> ad = new ArrayDeque<>();
        try (BufferedReader br = new BufferedReader(new FileReader(historyFile))) {
            String historyLine;
            while ((historyLine = br.readLine()) != null) {
                if (ad.size() > linesNumber) {
                    ad.removeFirst();
                }
                ad.add(historyLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String historyLine;
        while ((historyLine = ad.pollFirst()) != null) {
            consumer.accept(historyLine);
        }
    }
}
