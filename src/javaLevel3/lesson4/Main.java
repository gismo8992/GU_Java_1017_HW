package javaLevel3.lesson4;

public class Main {

    public static void main(String[] args) {
        /*
        1. Создать три потока, каждый из которых выводит определенную букву (A, B и C) 5 раз (порядок – ABСABСABС).
        Используйте wait/notify/notifyAll.
         */
        System.out.println("Task4");
        new Thread(new WaitNotifyClass('A', 'B')).start();
        new Thread(new WaitNotifyClass('B', 'C')).start();
        new Thread(new WaitNotifyClass('C', 'A')).start();
    }
}
