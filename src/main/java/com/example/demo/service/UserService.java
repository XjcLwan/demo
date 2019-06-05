package com.example.demo.service;

import com.example.demo.bean.TPost;
import com.example.demo.bean.TUser;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper usermapper;


    public String insertUser(TUser user){
        usermapper.insertUser(user);
        return "user add ok";
    }

    public List<TUser> findAll(){
        return  usermapper.findAll();

    }

    public String deleteUser(Integer id){
        usermapper.deleteByid(id);
        return "delete ok";
    }
}
