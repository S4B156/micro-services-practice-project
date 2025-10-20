package com.pet.hello_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "user-service")
public interface UserClient {
    @GetMapping("/api/users/list")
    List<String> getListUsers();
}
