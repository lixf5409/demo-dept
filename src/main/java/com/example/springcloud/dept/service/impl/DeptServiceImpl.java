package com.example.springcloud.dept.service.impl;

import com.example.springcloud.dept.dao.entity.Dept;
import com.example.springcloud.dept.dao.mapper.DeptMapper;
import com.example.springcloud.dept.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lixiaofeng on 2019/11/12.
 */
@Service("userService")
public class DeptServiceImpl implements IDeptService {
    @Autowired
    DeptMapper deptMapper;
    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }

    @Override
    public Dept getDept(Integer deptId) {
        return deptMapper.getDept(deptId);
    }
}
