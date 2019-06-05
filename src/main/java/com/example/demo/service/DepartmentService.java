package com.example.demo.service;

import com.example.demo.bean.TDepartment;
import com.example.demo.bean.TPost;
import com.example.demo.mapper.DepartmentMapper;
import com.example.demo.mapper.PostMapper;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;



    public  String isnertDepartment(TDepartment department){
        departmentMapper.insertDepartment(department);
        return "add ok";
    }
    public List<TDepartment> findAll(){
        return  departmentMapper.findAll();

    }
}
