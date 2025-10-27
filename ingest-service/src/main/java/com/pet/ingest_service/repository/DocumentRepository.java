package com.pet.ingest_service.repository;

import com.pet.ingest_service.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}
