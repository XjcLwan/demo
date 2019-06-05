package com.example.demo.service;

import com.example.demo.bean.TPost;
import com.example.demo.bean.TUser;
import com.example.demo.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    PostMapper postMapper;



    public  String isnertPost(TPost post){
        postMapper.insertPost(post);
        return "post add ok";
    }
    public List<TPost> findAll(){
        return  postMapper.findAll();

    }
}
