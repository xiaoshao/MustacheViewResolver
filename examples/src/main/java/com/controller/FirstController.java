package com.controller;

import com.bean.Record;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FirstController {

    @RequestMapping(value = "/first", method = RequestMethod.GET)
    public String first() {
        return "hello";
    }

    @RequestMapping("second")
    public String second(Model model) {
        Record record = new Record("second");
        model.addAttribute("record", record);
        return "secondView";
    }

    @RequestMapping("third")
    public Record third(){
        Record record = new Record("thirds");
        return record;
    }

    @RequestMapping("tiles")
    public String tiles(){
        return "home";
    }

}
