package com.example.demo.controller;

import com.example.demo.model.Member;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(Model model, HttpSession session) {
        Member member = (Member) session.getAttribute("loggedInMember");
        if (member == null) {
            return "redirect:/auth/login";
        }
        model.addAttribute("member", member);
        return "home";
    }

    @GetMapping("/")
    public String index() {
        return "redirect:/home";
    }
}