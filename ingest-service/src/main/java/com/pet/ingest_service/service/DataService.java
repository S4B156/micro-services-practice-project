package com.pet.ingest_service.service;

import com.pet.ingest_service.entity.Data;
import com.pet.ingest_service.repository.DataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DataService {
    private final DataRepository dataRepository;
    public void saveNewData(String data){
        Data newData = new Data();
        newData.setData(data);
        dataRepository.save(newData);
    }

    public List<String> getAllData() {
        return dataRepository.findAll().stream().map(Data::getData).toList();
    }
}
