package com.codecool.solid_adventures.communication;

import com.codecool.solid_adventures.communication.messageTypes.SMS;

public class MessageService {
    public void send(SMS sms, String message){
        System.out.println(sms.composeMessage(message));
    }

}
