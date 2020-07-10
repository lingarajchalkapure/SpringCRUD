package com.home.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.dao.CRUDDao;
import com.home.model.Employee;

@Service
public class CRUDSerImpl implements CRUDService {

	@Autowired
	private CRUDDao dao;

	public void save(Employee emp) {
		dao.save(emp);
	}

	public List<Employee> getEmployees() {
		List<Employee> emp_List=dao.getEmployees();
		return emp_List;
	}

	public Employee editEmployee(int id) {
		  Employee emp = dao.editEmployee(id);
		  return emp;
	}

	public void deleteEmployee(int id) {
			dao.deleteEmployee(id);
	}
}
