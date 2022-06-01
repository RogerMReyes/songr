package com.songr401cfd12.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/")
    public String splash(){
        return "splash";
    }

    @GetMapping("/hello world")
    @ResponseBody
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/capitalize/{word}")
    @ResponseBody
    public String capitalize(@PathVariable String word){
        String upperCase = word.toUpperCase();
        return upperCase;
    }
}
