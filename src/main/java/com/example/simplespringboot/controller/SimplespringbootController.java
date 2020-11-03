package com.example.simplespringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nick on Nov 3, 2020
 */

@RestController
public class SimplespringbootController {

    @RequestMapping("/")
    public String sendMessage() {
        return "This is the message";
    }
}
