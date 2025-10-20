package com.pet.hello_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloController {
    private final UserClient userClient;

    public HelloController(UserClient userClient) {
        this.userClient = userClient;
    }

    @GetMapping
    public String sayHello(){
        return "Hello from hello-service! (via Gateway & Consul)";
    }
    @GetMapping("/users")
    public String sayHelloUsers(){
        StringBuilder str = new StringBuilder();
        for(String user : userClient.getListUsers()) str.append("Hello ").append(user).append("! ");

        return str.toString();
    }
}
