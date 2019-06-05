package com.example.demo.service;

import com.example.demo.bean.TDepartmentDepartment;
import com.example.demo.bean.TUser;
import com.example.demo.mapper.DoubleDepartmentMapper;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoubleDepartmentService {
    @Autowired
    DoubleDepartmentMapper departmentMapper;


    public String insert(TDepartmentDepartment departmentDepartment){
        departmentMapper.insert(departmentDepartment);
        return "add ok";
    }

    public List<TDepartmentDepartment> findAll(){
        return  departmentMapper.findAll();

    }

    public String delete(Integer id){
        departmentMapper.deleteByid(id);
        return "delete ok";
    }
}
