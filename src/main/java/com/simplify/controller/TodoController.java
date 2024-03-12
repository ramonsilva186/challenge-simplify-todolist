package com.simplify.controller;

import com.simplify.entity.Todo;
import com.simplify.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;
    @PostMapping()
    public List<Todo> create(@RequestBody @Valid Todo todo) {
        return todoService.create(todo);
    }
    @GetMapping()
    public List<Todo> list() {
        return todoService.list();
    }
    @PutMapping()
    public List<Todo> update(@RequestBody Todo todo) {
        return todoService.update(todo);
    }
    @DeleteMapping("{id}")
    public List<Todo> delete(@PathVariable("id") Long id) {
        return todoService.delete(id);
    }

}
