package com.example.mvcjavadeveloper.person;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;
import java.util.SimpleTimeZone;

@Controller
@RequestMapping("/person")
public class PersonContoller {
    public String HTML_HEADER = "<html><head></head><body>";
    public String HTML_FOOTER = "</body></html>";

    @GetMapping("/test")
    public String test(Model model) {
        System.out.println("Uzytkownik wszedł w metodę test");
        Integer i = new Random().nextInt();
        model.addAttribute("random", i);
        return "person/test";
    }

    @GetMapping("/list")
    public String list() {
        return "person/list";

    }
    @GetMapping("/details")
    public String details(Model model) {
        Person mateusz = new Person(1, "m.stanowski97@gmail.com", "Stanocha", true, new Date());
        model.addAttribute("user", mateusz);
        return "person/details";


    }


}


