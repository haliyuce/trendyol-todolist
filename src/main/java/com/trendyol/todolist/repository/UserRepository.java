package com.trendyol.todolist.repository;

import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.repository.CrudRepository;

import com.trendyol.todolist.model.User;

@ViewIndexed(designDoc = "user", viewName = "all")
public interface UserRepository extends CrudRepository<User, Integer> {
    User findOneByUserName(String userName);
}
