package com.controller;

import com.bean.Record;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class FirstController {

    @RequestMapping("first")
    public String first() {
        return "hello";
    }

    @RequestMapping("second")
    public String second(Model model) {
        Record record = new Record("second");
        model.addAttribute("record", record);
        return "secondView";
    }
}
