package com.example.freemoneynoscam.checkemail;

public class CheckEmail {
    final static String Regexletters = "(?i).*[a-z].*";

    public static boolean CheckEmail(String text) {
        if (text.contains("@") && text.contains(".") && text.matches(Regexletters)) {
            System.out.println("email is valid");
            return true;
        } else {
            System.out.println("email is invalid");
            return false;
        }
    }
}
