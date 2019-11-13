package com.example.springcloud.dept.controller;


import com.alibaba.fastjson.JSON;
import com.example.springcloud.dept.dao.entity.Dept;
import com.example.springcloud.dept.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    IDeptService deptService;

    @RequestMapping("/listDept")
    public String listDept(Model model) {
        List<Dept> depts = deptService.findAll();
        model.addAttribute("depts", depts);
        return "user";
    }
    @RequestMapping("/getDept")
    @ResponseBody
    public String getDept(Integer deptId) {
        Dept dept = deptService.getDept(deptId);
        return JSON.toJSONString(deptId);
    }
}