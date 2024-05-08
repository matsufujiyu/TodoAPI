package com.example.toapi.service.todo;

import lombok.Value;

@Value
public class TodoEntity {

     long id;
     String userId;
     String title;
     String status;
     String details;

}
