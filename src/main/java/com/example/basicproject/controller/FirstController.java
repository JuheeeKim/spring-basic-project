package com.example.basicproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        model.addAttribute("username", "juheee");
        return "greetings"; // templetes/greetings.mustache -> 브라우저로 전송!
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickname", "juheee");
        return "goodbye"; // templetes/greetings.mustache -> 브라우저로 전송!
    }
}
