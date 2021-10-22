package com.example.freemoneynoscam.controllers;

import com.example.freemoneynoscam.Repository.EmailRepository;
import connector.JDBC;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class EmailController {
    JDBC jdbc = new JDBC();

    private EmailRepository emailRepo = new EmailRepository();
    //Benyt localhost:8080/single-user
    @GetMapping("/single-user")
    public String SingleEmail(Model model) {
        String username = emailRepo.fetchSingleEmail();
        model.addAttribute("UsernameThony",username);
        return "single-email";
    }
    @GetMapping("/allfouremails")
    public String allFourEmail(Model model) {
        ArrayList<String> username2 = emailRepo.fetchAllEmails();
        model.addAttribute("Username2Thony",username2);
        return "allfouremails";
    }
    @GetMapping("/allemails")
    public String allemails(Model model) {
        ArrayList<String> emails = jdbc.getList();
        model.addAttribute("emails",emails);
        return "allemails";
    }

}
