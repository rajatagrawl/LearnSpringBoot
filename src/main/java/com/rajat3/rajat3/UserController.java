package com.rajat3.rajat3;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UserController {

    @PostMapping("/createUser")
    public String createUser(@RequestBody User user) {
        return "User created: " + user.getName();
    }
}
