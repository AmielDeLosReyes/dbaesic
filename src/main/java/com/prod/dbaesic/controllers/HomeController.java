package com.prod.dbaesic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("requestURI", "/index.html");
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("requestURI", "/about.html");
        return "about";
    }

    @GetMapping("/blog")
    public String blog(Model model) {
        model.addAttribute("requestURI", "/blog.html");
        return "blog";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("requestURI", "/contact.html");
        return "contact";
    }

    @GetMapping("/shop")
    public String shop(Model model) {
        model.addAttribute("requestURI", "/shop.html");
        return "shop";
    }

    @GetMapping("/singlePost")
    public String singlePost(Model model) {
        model.addAttribute("requestURI", "/single-post.html");
        return "single-post";
    }

    @GetMapping("/styles")
    public String styles(Model model) {
        model.addAttribute("requestURI", "/styles.html");
        return "styles";
    }

    @GetMapping("/thankYou")
    public String thankYou(Model model) {
        model.addAttribute("requestURI", "/thank-you.html");
        return "thank-you";
    }
}
