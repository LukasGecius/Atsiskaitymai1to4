package com.example.lukas.antrasdarbasv2;

public class OrderMessage {

    String name;
    String message;

    public OrderMessage() {
    }

    public OrderMessage(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }
}
