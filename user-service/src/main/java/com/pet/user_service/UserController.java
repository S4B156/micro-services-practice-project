package com.pet.user_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {
    private static final List<String> users = List.of("Kate", "Mark", "Bob", "Olivia");

    @GetMapping
    public String getAllUsers(){
        return "All users at the moment(By the way, this data is from the user-service): " + users.toString();
    }

    @GetMapping("/list")
    public List<String> getUsersList(){
        return users;
    }
}
