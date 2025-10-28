package com.pet.ingest_service.service;

import com.pet.ingest_service.HashGenerator;
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
    private final S3Service s3Service;
    private final HashGenerator hashGenerator;

    public void saveDocument(MultipartFile multipartFile){
        String key = s3Service.uploadFile(multipartFile);
        String hashKey = hashGenerator.generateHash(key);

        Document document = new Document();
        document.setFileName(multipartFile.getOriginalFilename());
        document.setExtension(multipartFile.getContentType());
        document.setKey(key);
        document.setHashKey(hashKey);

        documentRepository.save(document);
    }

    public List<String> getAllFiles(){
        return documentRepository.findAll().stream().map(Document::getFileName).toList();
    }
}
