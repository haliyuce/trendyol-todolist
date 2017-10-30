package com.trendyol.todolist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trendyol.todolist.model.User;
import com.trendyol.todolist.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    public boolean register(User user) {
        
        try {
            this.userRepository.save(user);
        } catch (Exception e) {
            return false;
        }
        
        return true;

    }
    
    public User findByUserName(String userName) {
        return this.userRepository.findOneByUserName(userName);
    }

}
