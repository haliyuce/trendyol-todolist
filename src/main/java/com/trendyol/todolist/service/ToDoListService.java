package com.trendyol.todolist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trendyol.todolist.model.TodoListItem;
import com.trendyol.todolist.repository.TodoListRepository;

@Service
public class ToDoListService {
    
    @Autowired
    private TodoListRepository todoListRepository;
    
    public void insertOrUpdate(List<TodoListItem> todoListItems, int userId) {
        todoListItems.forEach(item -> {
            item.setOwnerUserId(userId);
            
            if(item.getId()>-1) {
                this.todoListRepository.delete(item);
            }
            
            this.todoListRepository.save(item);
        });
    }

    public List<TodoListItem> getItems(int userId) {
        return this.todoListRepository.findByOwnerUserId(userId);
    }

}
