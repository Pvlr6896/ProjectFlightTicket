package com.example.flightApp.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.flightApp.user.User;

public interface UserRepo extends CrudRepository<User,Integer> {
    void deleteByUserId(String userId);
    
}

