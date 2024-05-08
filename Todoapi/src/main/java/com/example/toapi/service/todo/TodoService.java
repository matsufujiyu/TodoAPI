package com.example.toapi.service.todo;

import com.example.toapi.repository.todo.TodoRecord;
import com.example.toapi.repository.todo.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoEntity find(long id) {
        return todoRepository.select(id)
                .map(record -> new TodoEntity(record.getId(),record.getUserId(),record.getTitle(), record.getStatus(), record.getDetails()))
                .orElseThrow(() ->new TodoEntityNotFoundException(id));

    }

    public List<TodoEntity> find() {
       return List.of(
               new TodoEntity(1L,"userId2","title2","status2","details2"),
               new TodoEntity(1L,"userId2","title2","status2","details2"));


    }

    public TodoEntity create(String userId,String title,String status,String details) {
        var record = new TodoRecord(null,userId,title,status,details);
        todoRepository.insert(record);
        return new TodoEntity(record.getId(), record.getUserId(), record.getTitle(), record.getStatus(), record.getDetails());
    }
}
