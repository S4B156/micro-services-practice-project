package com.pet.ingest_service.controller;

import com.pet.ingest_service.service.DocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/document")
@RequiredArgsConstructor
public class DocumentController {
    private final DocumentService dataService;

    @GetMapping
    public ResponseEntity<?> getAllDocuments(){
        List<String> list = dataService.getAllFiles();
        return ResponseEntity.ok(list.toString());
    }

    @PostMapping(value = "/upload", consumes = "multipart/form-data")
    public ResponseEntity<?> handleFileUpload(@RequestParam("file") MultipartFile file) {
        dataService.saveDocument(file);
        return ResponseEntity.ok("Successful file upload!");
    }
}
