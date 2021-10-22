package com.example.freemoneynoscam.Repository;

import com.example.freemoneynoscam.model.Email;

import java.util.ArrayList;
import java.util.List;

public class EmailRepository {

    public String fetchSingleEmail() {
        return "Thony@gmail.com";
    }
    public ArrayList<String> fetchAllEmails() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Bent@hotmail.com");
        list.add("Gerda@hotmail.com");
        list.add("Cecilie@hotmail.com");
        list.add("Katrine@hotmail.com");
        return list;
    }
}
