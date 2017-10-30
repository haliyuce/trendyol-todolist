package com.trendyol.todolist.model;

import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

import lombok.Data;

@Document
@Data
public class TodoListItem {
    
    @Id
    @Field
    @GeneratedValue(strategy = GenerationStrategy.UNIQUE)
    public int id;
    
    @Field
    public String text;
    
    @Field
    public boolean done;
    
    @Field
    public int ownerUserId;

}
