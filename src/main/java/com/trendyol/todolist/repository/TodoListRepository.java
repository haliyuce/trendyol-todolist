package com.trendyol.todolist.repository;

import java.util.List;

import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.repository.CrudRepository;

import com.trendyol.todolist.model.TodoListItem;

@ViewIndexed(designDoc = "todolistitems", viewName = "all")
public interface TodoListRepository extends CrudRepository<TodoListItem, String>  {
    
    List<TodoListItem> findByOwnerUserId(int ownerUserId);

}
