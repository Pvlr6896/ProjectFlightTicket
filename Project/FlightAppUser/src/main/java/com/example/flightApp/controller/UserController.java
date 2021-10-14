package com.example.flightApp.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flightApp.service.UserService;
import com.example.flightApp.user.User;

@RequestMapping("/users")
@RestController
public class UserController {

    private UserService userservice;
    
    @Autowired
    public UserController(UserService service){
        this.userservice = service;
    }

    @GetMapping
    public List<User> getUsers(){
        return userservice.getUsers();
    }

    @DeleteMapping("{userId}")
    public ResponseEntity<Boolean> deleteUserById(@PathVariable String userId){
        return ResponseEntity.ok(userservice.deleteUser(userId));
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user){
        return ResponseEntity.ok(userservice.addUser(user));
    }

}
