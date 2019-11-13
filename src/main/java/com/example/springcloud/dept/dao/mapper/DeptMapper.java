package com.example.springcloud.dept.dao.mapper;

import com.example.springcloud.dept.dao.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lixiaofeng on 2019/11/12.
 */
@Mapper()
@Repository("deptMapper")
public interface DeptMapper {

    @Select("SELECT dept_id as deptId,dept_code as deptCode ,dept_name as deptName FROM org_dept ")
    List<Dept> findAll();
    @Select("SELECT dept_id as deptId,dept_code as deptCode ,dept_name as deptName FROM org_dept where deot_id=#{deptId}")
    Dept getDept(@Param("deptId") Integer deptId);
}
