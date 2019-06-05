package com.example.demo.mapper;

import com.example.demo.bean.TUser;
import com.example.demo.bean.TUserDepartment;
import org.apache.ibatis.annotations.*;

import java.util.List;


//指定这是一个操作数据库的mapper
@Mapper
public interface UserDepartmentMapper {

    //根据用户id查看用户信息
    @Select("select * from t_user_department where id=#{id}")
    public TUser selectByid(@Param("id") int id);

    //根据用户id删除用户
    @Delete("delete from t_user_department where id=#{id}")
    public int deleteByid(Integer id);

    //添加用户
    @Insert("insert into t_user_department values(#{id},#{user_id},#{department_id}" +
            ",CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)")
    public int insert(TUserDepartment userDepartment);


    @Update("update t_user_department set sname=#{sname} where sno=#{sno}")
    int update(String sname, String sno);

    //查找所有用户信息
    @Select("select * from t_user_department")
    List<TUserDepartment> findAll();
}
