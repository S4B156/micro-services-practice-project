package com.pet.ingest_service.controller;

import com.pet.ingest_service.service.DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/data")
@RequiredArgsConstructor
public class SaveController {
    private final DataService dataService;

    @GetMapping
    public String allData(){
        List<String> data = dataService.getAllData();
        return data.isEmpty() ? "None" : data.toString();
    }

    @PostMapping("/save/{data}")
    public String saveData(@PathVariable String data) {
        dataService.saveNewData(data);
        return "redirect:/api/data";
    }
}
