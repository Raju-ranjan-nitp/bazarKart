package org.bazarkart.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
    @GetMapping
    public String addUser(){
        return "user Added";
    }
}
