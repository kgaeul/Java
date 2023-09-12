package com.kh.hw.person.model.vo;

public class Employee {
	int salary;
	String dept;
	
	public Employee() {
		
	}
	public Employee(int salary,String dept) {
		
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public String getDept() {
		return dept;
	}
	
}
