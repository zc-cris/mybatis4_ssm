package com.zc.cris.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zc.cris.mybatis.bean.Employee;
import com.zc.cris.mybatis.dao.EmployeeMapper;

@Service
public class EmpService {

	@Autowired
	private EmployeeMapper mapper;
	
	public List<Employee> getEmps(){
		System.out.println(mapper);
		System.out.println(mapper.getEmps());
		return mapper.getEmps();
	}

	@Transactional
	public void updateEmp() {
		Employee employee = new Employee(1, "林允儿", null, null);
		mapper.updateEmp(employee);
		int i = 1/0;
	}
}
