package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class Employee_DAO {
	
	public static void main(String[] args) {
		
		System.out.println("Create Employee 1");
		Employee_DAO.insert_data();
		
		
	}
	
	
	public static void insert_data() {
		try {
			
			SessionFactory sessionfactory= new AnnotationConfiguration().configure().buildSessionFactory();
			Session session = sessionfactory.openSession();
			
			Employee employee_obj= new Employee();
			
			employee_obj.setEmp_id(5);
			employee_obj.setEmployee_name("Sai");
			employee_obj.setMobile_no("1234");
			
			session.save(employee_obj);
			session.beginTransaction().commit();
			session.close();
			sessionfactory.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void get_data() {
		try {
			
			SessionFactory sessionfactory= new AnnotationConfiguration().configure().buildSessionFactory();
			Session session = sessionfactory.openSession();
			
			
			Employee employee_obj= new Employee();
			
			employee_obj=(Employee)session.get(Employee.class, 2);
			
			System.out.println(employee_obj.getEmployee_name());
			System.out.println(employee_obj.getMobile_no());

			
			
			session.beginTransaction().commit();
			session.close();
			sessionfactory.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void update() {
		try {
			
			SessionFactory sessionfactory= new AnnotationConfiguration().configure().buildSessionFactory();
			Session session = sessionfactory.openSession();
			
			
			Employee employee_obj= new Employee();
			
			employee_obj.setEmp_id(4);
			employee_obj.setEmployee_name("PujaN");
			employee_obj.setMobile_no("420-updTd");
			
			session.update(employee_obj);
			
			System.out.println(employee_obj.getEmployee_name());
			
			
			session.beginTransaction().commit();
			session.save(employee_obj);
			session.close();
			sessionfactory.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	public static void delete() {
		try {
			
			SessionFactory sessionfactory= new AnnotationConfiguration().configure().buildSessionFactory();
			Session session = sessionfactory.openSession();
			
			
			Employee employee_obj= new Employee();
			
			employee_obj.setEmp_id(5);
			
			session.delete(employee_obj);
			

			
			session.beginTransaction().commit();
			session.close();
			sessionfactory.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}


}

