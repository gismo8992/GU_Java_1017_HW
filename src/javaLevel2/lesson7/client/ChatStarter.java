package javaLevel2.lesson7.client;

public class ChatStarter {
    public static void run() {
        run("localhost", 8585);
    }

    public static void run(String host, int port) {
        new Chat(host, port);
    }
}
