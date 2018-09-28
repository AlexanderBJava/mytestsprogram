package ru.alexanderB.Secure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="my friend") String name, Map<String, Object> model) {
        model.put("name", name);
        return "greeting";
    }

    @GetMapping("/error")
    public String error(@RequestParam(name="name", required=false, defaultValue=".") String name, Model model) {
        model.addAttribute("name", name);
        return "error";
    }

    @GetMapping
    public String main( Map<String, Object> model) {
        model.put("someInMain", "Hello Everyone!");
        return "main";
    }
}