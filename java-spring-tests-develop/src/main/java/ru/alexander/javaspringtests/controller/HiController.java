package ru.alexander.javaspringtests.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HiController {

    @GetMapping("/hi")
    public String hi(@RequestParam String message) {
        if (message.equals("Hello")) {
            return "Hi!";
        }
        return "Bye";
    }
}

