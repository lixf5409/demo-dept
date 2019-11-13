package com.example.springcloud.dept.dao.entity;

/**
 * Created by lixiaofeng on 2019/11/12.
 */
public class Dept {
    private String deptId;
    private String deptName;
    private String deptCode;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptId='" + deptId + '\'' +
                ", deptName='" + deptName + '\'' +
                ", deptCode='" + deptCode + '\'' +
                '}';
    }
}
