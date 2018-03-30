package com.zc.cris.mybatis.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zc.cris.mybatis.bean.Employee;
import com.zc.cris.mybatis.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	private EmpService empService;
	
	@RequestMapping("emps")
	public String getEmps(Map<String, Object> map) {
		List<Employee> emps = empService.getEmps();
		map.put("emps", emps);
		return "list";
	}
	
}
