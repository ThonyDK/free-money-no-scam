package com.example.freemoneynoscam.checkemail;

public class CheckEmail {
    public static boolean CheckEmail(String text) {
        if (text.contains("@")) {
            return true;
        } else {
            return false;
        }
    }
}
