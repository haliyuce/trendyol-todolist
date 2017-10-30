package com.trendyol.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.trendyol.todolist.model.AuthenticatedUser;
import com.trendyol.todolist.model.TodoListItem;
import com.trendyol.todolist.service.ToDoListService;

@RestController
@RequestMapping("/todolist")
public class TodoListController {
    
    @Autowired
    private ToDoListService toDoListService;
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveOrUpdateItems(@RequestBody List<TodoListItem> items, @AuthenticationPrincipal AuthenticatedUser authenticated) {
        this.toDoListService.insertOrUpdate(items, authenticated.getUser().getId());
    }
    
    @GetMapping
    public List<TodoListItem> getItems(@AuthenticationPrincipal AuthenticatedUser authenticated) {
        return this.toDoListService.getItems(authenticated.getUser().getId());
    }

}
