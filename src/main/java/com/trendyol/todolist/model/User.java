package com.trendyol.todolist.model;

import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

import lombok.Builder;
import lombok.Data;

@Document
@Data
@Builder
public class User{

    @Id
    @Field
    @GeneratedValue(strategy = GenerationStrategy.UNIQUE)
    private int id;

    @Field
    private String userName;

    @Field
    private String password;

}
