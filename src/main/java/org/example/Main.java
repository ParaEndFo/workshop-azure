package org.example;

import org.example.servicebus.QueueManager;
import org.example.servicebus.TopicManager;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        QueueManager.sendMessage("Hello, World!");
        QueueManager.sendMessageBatch(Arrays.asList("First message", "Second message", "Third message"));
        QueueManager.receiveMessages();

        TopicManager.sendMessage("Hello, World!");
        TopicManager.sendMessageBatch(Arrays.asList("First message", "Second message", "Third message"));
        TopicManager.receiveMessages();

    }
}