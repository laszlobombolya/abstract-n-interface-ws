package com.codecool.solid_adventures.communication;

import com.codecool.solid_adventures.communication.messageTypes.Email;
import com.codecool.solid_adventures.communication.messageTypes.SMS;

public class Main {
    public static void main(String[] args) {
        // Sending different type of messages with the MessageService
        MessageService messageSender = new MessageService();

        SMS sms = new SMS();
        Email email = new Email();
        String message = "Lovely message to our unicorns";

        messageSender.send(sms, message);
    }
}
