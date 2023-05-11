package org.example;

import org.example.servicebus.QueueManager;
import org.example.servicebus.TopicManager;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        QueueManager.sendMessage();
        QueueManager.sendMessageBatch();
        QueueManager.receiveMessages();

        TopicManager.sendMessage();
        TopicManager.sendMessageBatch();
        TopicManager.receiveMessages();

    }
}