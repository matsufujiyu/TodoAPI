package com.example.toapi.sample;

import com.example.toapi.repository.sample.SampleRecord;
import com.example.toapi.repository.sample.SampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SampleService {

    private final SampleRepository repository;

    public SampleEntity find() {
        var record =repository.select();
        return new SampleEntity(record.getContent());
    }
}
