package com.example.demo.mapper;

import com.example.demo.bean.TDepartment;
import com.example.demo.bean.TPost;
import com.example.demo.bean.TUser;
import org.apache.ibatis.annotations.*;

import java.util.List;


//指定这是一个操作数据库的mapper
@Mapper
public interface DepartmentMapper {

    @Select("select * from t_department where id=#{id}")
    public TDepartment selectDepartmentByid(@Param("id") int id);

    @Delete("delete from t_department where id=#{id}")
    public int deleteByid(int id);



    @Insert("insert into t_department values(#{id},#{short_name},#{full_name}" +
            ",#{show_order},#{canceled},CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)")
    public int insertDepartment(TDepartment department);




    @Update("update t_department set sname=#{sname} where sno=#{sno}")
    int update(String sname, String sno);


    @Select("select * from t_department")
    List<TDepartment> findAll();
}
