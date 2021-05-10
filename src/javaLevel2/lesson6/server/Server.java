package javaLevel2.lesson6.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public Server() {
        try {
            ServerSocket serverSocket = new ServerSocket(8899);
            System.out.println("Server is ready...");
            System.out.println("Waiting for a connection...");
            Socket accept = serverSocket.accept();
            System.out.println("Connection established: " + accept);

            DataInputStream in = new DataInputStream(accept.getInputStream());
            DataOutputStream out = new DataOutputStream(accept.getOutputStream());

            Scanner serverScanner = new Scanner(System.in);

            new Thread(() ->{
                while (true) {
                    try {
                        out.writeUTF(serverScanner.nextLine());
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
                        System.out.println("Server is disconnected");
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
