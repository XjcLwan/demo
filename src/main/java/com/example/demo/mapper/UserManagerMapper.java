package com.example.demo.mapper;

import com.example.demo.bean.TUser;
import com.example.demo.bean.TUserManager;
import org.apache.ibatis.annotations.*;

import java.util.List;


//指定这是一个操作数据库的mapper
@Mapper
public interface UserManagerMapper {

    //根据用户id查看用户信息
    @Select("select * from t_user_manager where id=#{id}")
    public TUser selectByid(@Param("id") int id);

    //根据用户id删除关系
    @Delete("delete from t_user_manager where id=#{id}")
    public int deleteByid(Integer id);

    //添加信息
    @Insert("insert into t_user_manager values(#{id},#{user_id},#{manager_id}" +
            ",CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)")
    public int insert(TUserManager userManager);


    @Update("update t_user_manager set sname=#{sname} where sno=#{sno}")
    int update(String sname, String sno);

    //查找所有用户信息
    @Select("select * from t_user_manager")
    List<TUserManager> findAll();
}
