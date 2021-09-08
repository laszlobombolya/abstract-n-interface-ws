package com.codecool.solid_adventures.communication.messageTypes;

public class Email {
    public String composeMessage(String content){
        return "Content-Type: text/html;\n<html><head></head><body>"
                + content +
                "</body></html>";
    }
}
