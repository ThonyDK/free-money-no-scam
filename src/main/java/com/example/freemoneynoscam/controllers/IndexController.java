package com.example.freemoneynoscam.controllers;

import connector.JDBC;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    //postmapping er hvis vi skal have data som personlig oplysninger submittet fra hjemmeside via springboot og
    //videre til database.
    @PostMapping("/test")
    public String userEmail(WebRequest wr){
        String parameter = wr.getParameter("test-input");
        System.out.println(parameter);
        JDBC connection = new JDBC();
        connection.connectionTest(parameter);
        return "index";
    }
    //Getmapping er hvis vi skal hente data fra clienten/Browser til en database.
    //altså hvor det fx ikke er personlige oplysninger.
    @GetMapping("/test")
    public String test(){
        JDBC connection = new JDBC();
        //connection.connectionTest();
        return "index";
    }
    //Helloworld
}
