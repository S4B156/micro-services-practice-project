package com.pet.ingest_service.controller;

import com.pet.ingest_service.service.DocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/document")
@RequiredArgsConstructor
public class SaveController {
    private final DocumentService dataService;

    @GetMapping
    public String getAllDocuments(){
        // TODO: return all the documents that were uploaded
        return "";
    }

    @PostMapping("/save")
    public String saveDocument(@RequestParam MultipartFile multipartFile) {
        // TODO: save logic document
        return "";
    }
}
