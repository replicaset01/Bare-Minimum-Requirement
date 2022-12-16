package com.recommended;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String printTodo() {
        return "To-do Application !";
    }

    @GetMapping("/hello")
    public String printHello() {
        return "Hello.html";
    }
}
