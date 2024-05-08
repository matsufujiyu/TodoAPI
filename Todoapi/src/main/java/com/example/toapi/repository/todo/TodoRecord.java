package com.example.toapi.repository.todo;


import lombok.Value;

@Value
public class TodoRecord {

    Long id;
    String userId;
    String title;
    String status;
    String details;


}
