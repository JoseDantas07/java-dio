package com.example.first_web_api.repository;

import com.example.first_web_api.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {

    public void save(User user){
        if (user.getId() == null){
            System.out.println("Save - Recebendo o usuario na camada de repositorio");
        }else {
            System.out.println("Update - Recebendo o usuario na camada de repositorio");
        }
        System.out.println(user);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("Delete/id - recebendo o id: %d para exluir o usuario",id));
        System.out.println(id);
    }

    public List<User> findAll(){
        System.out.println("List - listando os usuario do sistema");
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"jose","123"));
        userList.add(new User(2,"jon","321"));
        return userList;
    }

    public User findById(Integer id){
        System.out.println(String.format("Find/id"));
        return new User(1,"jose","123");
    }

    public User findByName(String name){
        System.out.println(String.format("Find/name"));
        return new User(2,"jose","123");
    }
}
