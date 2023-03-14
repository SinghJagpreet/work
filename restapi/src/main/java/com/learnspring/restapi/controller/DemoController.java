package com.learnspring.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class DemoController {
    ArrayList<String> arr =  new ArrayList<>();

    @GetMapping("/hello")
    public String sayHello(){
        arr.add("");
        return "Hello World jjjp";
    } 
}
