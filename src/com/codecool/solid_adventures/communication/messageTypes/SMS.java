package com.codecool.solid_adventures.communication.messageTypes;

public class SMS {
    public String composeMessage(String content){
        return "Content-Disposition: form-data; name="
                + content;
    }
}
