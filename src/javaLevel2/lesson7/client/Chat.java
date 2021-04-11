package javaLevel2.lesson7.client;

import javaLevel2.lesson7.client.gui.ChatFrame;
import javaLevel2.lesson7.client.gui.api.Reciver;

public class Chat {
    private final ChatFrame frame;
    private final ChatCommunication communication;

    public Chat(String host, int port) {
        communication = new ChatCommunication(host, port);
        frame = new ChatFrame(data -> communication.transmit(data));

        new Thread(() -> {
            Reciver receiver = frame.getReceiver();
            while (true) {
                String msg = communication.receive();
                if (!msg.isBlank()) {
                    receiver.receive(msg);
                }
            }
        })
                .start();
    }

}
