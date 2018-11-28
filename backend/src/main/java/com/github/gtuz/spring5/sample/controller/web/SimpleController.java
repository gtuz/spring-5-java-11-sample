package com.github.gtuz.spring5.sample.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("web/simple")
public class SimpleController {

    @RequestMapping("welcome")
    public String simpleWelcome(){
        return "simple-welcome-page";
    }

    @RequestMapping("welcome-react")
    public String simpleWelcomeReact(){
        return "simple-welcome-page-react";
    }
}
