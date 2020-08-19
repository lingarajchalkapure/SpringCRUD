package com.home.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.home.model.Employee;

@Repository
public class CRUDDaoImpl implements CRUDDao{

	@Autowired
	private SessionFactory factory;

	public void save(Employee emp) {
		 Session session=factory.openSession();
		 Transaction tx = session.beginTransaction();
		 session.saveOrUpdate(emp);
		 tx.commit();
		 session.close();
	}

	public List<Employee> getEmployees() {
		Session session=factory.openSession();
		List<Employee> emp_List = session.createQuery("from Employee").list();
		return emp_List;
	}

	public Employee editEmployee(int id) {
		 Session session=factory.openSession();
		 Transaction tx = session.beginTransaction();
		 Employee emp = session.get(Employee.class, id);
		 tx.commit();
		 session.close();
		 return emp;
	}

	public void deleteEmployee(int id) {
		Session session=factory.openSession();
		 Transaction tx = session.beginTransaction();
		 Employee emp = (Employee)session.get(Employee.class, id);
		 session.delete(emp);
		 tx.commit();
		 session.close();
		
	}
}
