package com.example.FirstSpringAppApplication.controller;
import org.springframework.web.bind.annotation.*;

import com.example.FirstSpringAppApplication.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz!";
    }
}
