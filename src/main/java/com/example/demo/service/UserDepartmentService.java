package com.example.demo.service;

import com.example.demo.bean.TDepartment;
import com.example.demo.bean.TUser;
import com.example.demo.bean.TUserDepartment;
import com.example.demo.mapper.UserDepartmentMapper;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDepartmentService {
    @Autowired
    UserDepartmentMapper userDepartmentMapper;


    public String insert(TUserDepartment department){
        userDepartmentMapper.insert(department);
        return "user add ok";
    }

    public List<TUserDepartment> findAll(){
        return  userDepartmentMapper.findAll();

    }

    public String deleteUser(Integer id){
        userDepartmentMapper.deleteByid(id);
        return "delete ok";
    }
}
