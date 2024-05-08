package com.example.toapi.controller.todo;

import com.example.toapi.service.todo.TodoService;
import com.example.todoapi.controller.TodosApi;
import com.example.todoapi.model.Todo;
import com.example.todoapi.model.TodoListDTO;
import com.example.todoapi.model.TodoWithoutId;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


import java.net.URI;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class TodoController implements TodosApi {

    private final TodoService todoService;

    //一つのTODO取得（GET）
    @Override
    public ResponseEntity<Todo> showTodo(Long id) {
        var entity = todoService.find(id);
        var dto = new Todo();
        dto.setId(entity.getId());
        dto.setUserId(entity.getUserId());
        dto.setTitle(entity.getTitle());
        dto.setStatus(entity.getStatus());
        dto.setDetails(entity.getDetails());
        return ResponseEntity.ok(dto);
    }

    //201を返す（POST）
    @Override
    public ResponseEntity<Todo> createTodo(TodoWithoutId todo) {
        var entity = todoService.create(todo.getUserId(), todo.getTitle(), todo.getStatus(),todo.getDetails());
        var dto =new Todo();
        dto.setId(entity.getId());
        dto.setUserId(entity.getUserId());
        dto.setTitle(entity.getTitle());
        dto.setStatus(entity.getStatus());
        dto.setDetails(entity.getDetails());
        return ResponseEntity
                .created(URI.create("/todos"+ dto.getId()))
                .body(dto);
    }

    //GET 一覧

    @Override
    public ResponseEntity<TodoListDTO> listTodos() {
        var entityList = todoService.find();
        var dtoList = entityList.stream()
                .map(todoEntity -> {
                    var todo = new Todo();
                    todo.setId(todoEntity.getId());
                    todo.setUserId(todoEntity.getUserId());
                    todo.setTitle(todoEntity.getTitle());
                    todo.setStatus(todoEntity.getStatus());
                    todo.setDetails(todoEntity.getDetails());
                    return todo;
                })
                .collect(Collectors.toList());

        var dto = new TodoListDTO();
        dto.setResults(dtoList);

        return ResponseEntity.ok(dto);
    }
}