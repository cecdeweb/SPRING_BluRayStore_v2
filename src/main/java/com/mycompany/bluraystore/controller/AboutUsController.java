package com.mycompany.bluraystore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutUsController {

    @RequestMapping("/about-us")
    public String AboutUsController(){
        System.out.println("AboutUs ok !");
        return "about-us";
    }

}
