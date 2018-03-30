package com.zc.cris.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
