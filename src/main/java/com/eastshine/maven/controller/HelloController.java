package com.eastshine.maven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    public static final String HELLO_MESSAGE = "Hello world!";

    @GetMapping("/hello")
    public @ResponseBody String hello() {
        return HELLO_MESSAGE;
    }
}
