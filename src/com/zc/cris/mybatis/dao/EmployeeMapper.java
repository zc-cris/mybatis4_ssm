package com.zc.cris.mybatis.dao;

import java.util.List;

import com.zc.cris.mybatis.bean.Employee;

public interface EmployeeMapper {
	
	public Employee getById(Integer id);

	public List<Employee> getEmps();
	
	
}
