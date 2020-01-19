package com.example.impl2;

import com.example.Message;

public class MessageImpl2 implements Message {
    @Override
    public String readMessage() {
        return "MessageImpl2.readMessage ======";
    }

    @Override
    public String sendMessage(String msg) {
        return "MessageImpl2.sendMessage: " + msg + " ======";
    }
}
