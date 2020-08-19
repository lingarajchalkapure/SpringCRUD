package com.home.dao;

import java.util.List;

import com.home.model.Employee;

public interface CRUDDao {

	
	void save(Employee emp);
	
	List<Employee> getEmployees();
	
	Employee editEmployee(int id);

	void deleteEmployee(int id);

}
