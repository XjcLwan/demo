package com.example.demo.service;

import com.example.demo.bean.TUser;
import com.example.demo.bean.TUserPost;
import com.example.demo.mapper.UserMapper;
import com.example.demo.mapper.UserPostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPostService {
    @Autowired
    UserPostMapper userPostMapper;


    public String insert(TUserPost user){
        userPostMapper.insertUserPost(user);
        return "user add ok";
    }

    public List<TUserPost> findAll(){
        return  userPostMapper.findAll();

    }

    public String deleteUser(Integer id){
        userPostMapper.deleteByid(id);
        return "delete ok";
    }
}
