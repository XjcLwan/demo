package com.example.demo.service;

import com.example.demo.bean.TUser;
import com.example.demo.bean.TUserJob;
import com.example.demo.mapper.UserJobMapper;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserJobService {
    @Autowired
    UserJobMapper userJobMapper;


    public String insert(TUserJob userJob){
        userJobMapper.insert(userJob);
        return "add ok";
    }

    public List<TUserJob> findAll(){
        return  userJobMapper.findAll();

    }

    public String deleteUser(Integer id){
        userJobMapper.deleteByid(id);
        return "delete ok";
    }
}
