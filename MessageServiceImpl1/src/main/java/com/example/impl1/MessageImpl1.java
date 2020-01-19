package com.example.impl1;

import com.example.Message;

public class MessageImpl1 implements Message {
    @Override
    public String readMessage() {
        return "====== MessageImpl1.readMessage";
    }

    @Override
    public String sendMessage(String msg) {
        return "====== MessageImpl1.sendMessage: " + msg;
    }
}
