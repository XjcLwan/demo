package com.example.demo.mapper;

import com.example.demo.bean.TPost;
import com.example.demo.bean.TUser;
import org.apache.ibatis.annotations.*;

import java.util.List;


//指定这是一个操作数据库的mapper
@Mapper
public interface UserMapper {

    //根据用户id查看用户信息
    @Select("select * from t_user where id=#{id}")
    public TUser selectStudentByid(@Param("id") int id);

    //根据用户id删除用户
    @Delete("delete from t_user where id=#{id}")
    public int deleteByid(Integer id);

    //添加用户
    @Insert("insert into t_user values(#{id},#{state},#{name},#{login_id}" +
            ",#{sex},#{telephone},#{mobile},#{email}" +
            ",#{system_language},#{birthday},#{folk},#{native_place}" +
            ",#{regresident_place},#{id_card},#{marital_status},#{location_place}" +
            ",#{start_date},#{end_date},CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)")
    public int insertUser(TUser user);


    @Update("update t_user set sname=#{sname} where sno=#{sno}")
    int update(String sname,String sno);

    //查找所有用户信息
    @Select("select * from t_user")
    List<TUser> findAll();
}
