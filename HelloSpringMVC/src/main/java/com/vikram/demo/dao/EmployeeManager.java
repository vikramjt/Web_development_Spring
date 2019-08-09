package com.vikram.demo.dao;

import java.util.List;

import com.vikram.demo.model.EmployeeVO;

public interface EmployeeManager
{
    public List<EmployeeVO> getAllEmployees();
}