package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

    @RequestMapping("first")
    public String first() {
        return "hello";
    }
}
