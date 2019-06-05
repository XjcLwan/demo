package com.example.demo.mapper;

import com.example.demo.bean.TDepartment;
import com.example.demo.bean.TPost;
import com.example.demo.bean.TUser;
import org.apache.ibatis.annotations.*;

import java.util.List;


//指定这是一个操作数据库的mapper
@Mapper
public interface PostMapper {

    @Select("select * from t_post where id=#{id}")
    public TUser selectPostByid(@Param("id") int id);

    @Delete("delete from t_post where id=#{id}")
    public int deleteByid(int id);


    @Insert("insert into t_post values(#{id},#{short_name},#{full_name},#{remark}" +
            ",CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)")
    public int insertPost(TPost post);


    @Update("update t_post set sname=#{sname} where sno=#{sno}")
    int update(String sname, String sno);


    @Select("select * from t_post")
    List<TPost> findAll();
}
