package com.company;

import java.util.ArrayList;

public class Mail {
    String email;
    String message;



    public Mail(String email, String message) {
        this.email = email;
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("mail to: %s\n%s", email, message);
    }


}
