package com.example.demo.controller;

import com.example.demo.bean.*;
import com.example.demo.mapper.DoubleDepartmentMapper;
import com.example.demo.service.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostService postService;
    @Autowired
    UserService userService;
    @Autowired
    DepartmentService departmentService;
    @Autowired
    DoubleDepartmentService doubleDepartmentService;
    @Autowired
    UserDepartmentService userDepartmentService;
    @Autowired
    UserPostService userPostService;
    @Autowired
    UserJobService userJobService;
    @Autowired
    UserManagerService userManagerService;


    @RequestMapping(value = "/post/insert")
    public List<TPost> insertPost(){
        TPost tPost=new TPost();
        tPost.setId(5);
        tPost.setShort_name("IT");
        tPost.setFull_name("xinxikeji");
        tPost.setRemark("dasdsd");
//        tPost.setCreatetime("CURRENT_TIMESTAMP");
//        tPost.setUpdatetime("CURRENT_TIMESTAMP");
        postService.isnertPost(tPost);
        return postService.findAll();
    }
    @RequestMapping(value = "/user/delete/{id}")
    public List<TUser> deleteUser(@PathVariable("id") Integer id){
        userService.deleteUser(id);
        return userService.findAll();
    }
    @RequestMapping(value = "/user/insert")
    public List<TUser> insertUser(){
        TUser tPost=new TUser();
        tPost.setId(4);
        tPost.setState(1);
        tPost.setLast_name("xinxikeji");
        tPost.setLogin_id("aaaaaa");
        tPost.setSex(0);
        tPost.setTelephone("123456");
        tPost.setMobile("778899");
        tPost.setEmail("111111@22.cn");
        tPost.setSystem_language("7");
        tPost.setBirthday(new Date(2019-10-10));
        tPost.setFolk("kjhj");
        tPost.setNative_place("广东");
        tPost.setRegresident_place("广东广州1");
        tPost.setId_card("123456487989874");
        tPost.setMarital_status("fou");
        tPost.setLocation_place("guangdongguangzhou");
        tPost.setStart_date(new Date(2019-1-1));
        tPost.setEnd_date(new Date(2019-1-20));
//        tPost.setCreatetime("CURRENT_TIMESTAMP");
//        tPost.setUpdatetime("CURRENT_TIMESTAMP");
        userService.insertUser(tPost);
        return userService.findAll();
    }
    @RequestMapping(value = "/department/insert")
    public List<TDepartment> insertDepartment(){
        TDepartment tPost=new TDepartment();
        tPost.setId(103);
        tPost.setShort_name("IT");
        tPost.setFull_name("xinxikeji");
        tPost.setShow_order("dasdsd");
        tPost.setCanceled("1");
//        tPost.setCreatetime("CURRENT_TIMESTAMP");
//        tPost.setUpdatetime("CURRENT_TIMESTAMP");
        departmentService.isnertDepartment(tPost);
        return departmentService.findAll();
    }

    @RequestMapping(value = "/doudepartment/insert")
    public List<TDepartmentDepartment> insertDDepartment(){
        TDepartmentDepartment tPost=new TDepartmentDepartment();
        tPost.setId(1);
        tPost.setChile_dpartment_id(10);
        tPost.setFather_departmet_id(20);
        tPost.setIs_sub(1);
//        tPost.setCreatetime("CURRENT_TIMESTAMP");
//        tPost.setUpdatetime("CURRENT_TIMESTAMP");
        doubleDepartmentService.insert(tPost);
        return doubleDepartmentService.findAll();
    }

    @RequestMapping(value = "/userdepartment/insert")
    public List<TUserDepartment> insertUserDepartment(){
        TUserDepartment tPost=new TUserDepartment();
        tPost.setId(1);
        tPost.setUser_id(10);
        tPost.setDepartment_id(20);
//        tPost.setCreatetime("CURRENT_TIMESTAMP");
//        tPost.setUpdatetime("CURRENT_TIMESTAMP");
        userDepartmentService.insert(tPost);
        return userDepartmentService.findAll();
    }
    @RequestMapping(value = "/userpost/insert")
    public List<TUserPost> insertUserPost(){
        TUserPost tPost=new TUserPost();
        tPost.setId(1);
        tPost.setUser_id(10);
        tPost.setPost_id(20);
//        tPost.setCreatetime("CURRENT_TIMESTAMP");
//        tPost.setUpdatetime("CURRENT_TIMESTAMP");
        userPostService.insert(tPost);
        return userPostService.findAll();
    }

    @RequestMapping(value = "/userjob/insert")
    public List<TUserJob> insertUserjob(){
        TUserJob tPost=new TUserJob();
        tPost.setId(1);
        tPost.setUser_id(10);
        tPost.setJob_id(20);
//        tPost.setCreatetime("CURRENT_TIMESTAMP");
//        tPost.setUpdatetime("CURRENT_TIMESTAMP");
        userJobService.insert(tPost);
        return userJobService.findAll();
    }

    @RequestMapping(value = "/usermanager/insert")
    public List<TUserManager> insertUsermanager(){
        TUserManager tPost=new TUserManager();
        tPost.setId(1);
        tPost.setUser_id(10);
        tPost.setManager_id(20);
//        tPost.setCreatetime("CURRENT_TIMESTAMP");
//        tPost.setUpdatetime("CURRENT_TIMESTAMP");
        userManagerService.insert(tPost);
        return userManagerService.findAll();
    }

}


