package com.example.hellojenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class HelloJenkins {

    @GetMapping("/helloJenkins")
    public String helloJenkins(Map<String,Object> map){
        map.put("msg","helloJenkins");
        return "index";
    }
}
