package com.example.client;

import com.example.Message;

import java.util.ServiceLoader;

public class MyClient {
    public static void main(String[] args) {
        ServiceLoader<Message> serviceLoader = ServiceLoader.load(Message.class);

        for (Message message : serviceLoader) {
            System.out.println(message.readMessage());
            System.out.println(message.sendMessage("hello"));
        }
    }
}
