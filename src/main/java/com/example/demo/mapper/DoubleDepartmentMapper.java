package com.example.demo.mapper;

import com.example.demo.bean.TDepartment;
import com.example.demo.bean.TDepartmentDepartment;
import org.apache.ibatis.annotations.*;

import java.util.List;


//指定这是一个操作数据库的mapper
@Mapper
public interface DoubleDepartmentMapper {

    @Select("select * from t_department_department where id=#{id}")
    public TDepartment selectByid(@Param("id") int id);

    @Delete("delete from t_department_department where id=#{id}")
    public int deleteByid(int id);



    @Insert("insert into t_department_department values(#{id},#{chile_department_id},#{father_departmet_id}" +
            ",#{is_sub},CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)")
    public int insert(TDepartmentDepartment department);




    @Update("update t_department_department set sname=#{sname} where sno=#{sno}")
    int update(String sname, String sno);


    @Select("select * from t_department_department")
    List<TDepartmentDepartment> findAll();
}
