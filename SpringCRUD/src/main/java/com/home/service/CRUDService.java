package com.home.service;

import java.util.List;

import com.home.model.Employee;

public interface CRUDService {

	void save(Employee emp);

	List<Employee> getEmployees();

	Employee editEmployee(int id);

	void deleteEmployee(int id);

}
