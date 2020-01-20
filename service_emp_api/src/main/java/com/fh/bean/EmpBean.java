package com.fh.bean;

import com.fh.annotation.ExportExcel;
import com.fh.annotation.ExportTitle;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Lenovo
 * @title: EmpBean
 * @projectName service_emp_api
 * @description: TODO
 * @date 2020/1/1811:45
 */
@ExportTitle(title = "员工表")
public class EmpBean {
    @ExportExcel(name = "id")
    private Integer id;
    @ExportExcel(name = "jobId")
    private Integer jobId;
    @ExportExcel(name = "所在岗位")
    private String jobName;
    @ExportExcel(name = "工资")
    private BigDecimal salary;
    @ExportExcel(name = "入职时间")
    private Date entryTime;
    @ExportExcel(name = "leaderId")
    private Integer leaderId;
    @ExportExcel(name = "领导名字")
    private String leaderName;
    @ExportExcel(name = "deptId")
    private Integer deptId;
    @ExportExcel(name = "所在部门")
    private String deptName;
    @ExportExcel(name = "员工姓名")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Integer getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(Integer leaderId) {
        this.leaderId = leaderId;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
