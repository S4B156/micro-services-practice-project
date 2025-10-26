package com.pet.ingest_service.repository;

import com.pet.ingest_service.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Data, Long> {
}
