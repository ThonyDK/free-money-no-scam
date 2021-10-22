package com.example.freemoneynoscam.controllers;

import connector.JDBC;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class IndexController {
    JDBC connection = new JDBC();

    @GetMapping("/")
    public String index(){
        connection.getList();
        return "index";
    }
    //postmapping er hvis vi skal have data som personlig oplysninger submittet fra hjemmeside via springboot og
    //videre til database.
    //OBS. For at få vist rigtig indhold Benyt Localhost:8080/test
    @PostMapping("/test")
    public String userEmail(WebRequest wr){
        String parameter = wr.getParameter("test-input");
        System.out.println(parameter);
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


}
