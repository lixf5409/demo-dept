package com.example.springcloud.dept.service;

import com.example.springcloud.dept.dao.entity.Dept;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by lixiaofeng on 2019/11/12.
 */
public interface IDeptService {
    List<Dept> findAll();
    Dept getDept(@Param("Dept") Integer Dept);
}
