package com.pet.ingest_service.service;

import com.pet.ingest_service.entity.Document;
import com.pet.ingest_service.repository.DocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DocumentService {
    private final DocumentRepository documentRepository;
    public void saveDocument(MultipartFile multipartFile){
        Document document = new Document();
        // TODO: Logic document save
        documentRepository.save(document);
    }
}
