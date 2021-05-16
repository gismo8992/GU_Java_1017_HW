package javaLevel2.lesson6.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public Client() {

        try {
            Socket socket = new Socket("127.0.0.1", 8899);
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            Scanner clientScanner = new Scanner(System.in);

            new Thread(() ->{
                while (true) {
                    try {
                        out.writeUTF(clientScanner.nextLine());
                    } catch (IOException e) {
                        System.out.println("Client disconnect...");
                        System.out.println("Connection closed.");
                        break;
                    }
                }
            }).start();

            while (true) {
                try {
                    String message = in.readUTF();
                    if (message.equals("-quit")) {
                        System.out.println("Client is disconnected");
                        break;
                    }
                    System.out.println(message);
                } catch (IOException e) {
                    System.out.println("Incoming message chanel closed.");
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}