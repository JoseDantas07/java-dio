package com.example.first_web_api.controller;

import com.example.first_web_api.model.User;
import com.example.first_web_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping()
    public List<User> getUser(){
        return userRepository.findAll();
    }
    @GetMapping("{name}")
    public User getOne(@PathVariable("name") String name){
        return userRepository.findByName(name);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Integer id){
        userRepository.deleteById(id);
    }
    @PostMapping()
    public void putUser(@RequestBody User user){
        userRepository.save(user);
    }
}
