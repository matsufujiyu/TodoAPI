package com.example.toapi.controller.sample;

import java.time.LocalDateTime;

public class SampleDTO {

    private String content;
    private LocalDateTime timestamp;

    public String getContent() {
        return content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public SampleDTO(String content, LocalDateTime timestamp) {
        this.content = content;
        this.timestamp = timestamp;
    }



}
