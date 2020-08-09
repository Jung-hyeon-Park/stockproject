package com.parkjh.stockproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/api/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String Dashboard() {
        return "/index";
    }
}
