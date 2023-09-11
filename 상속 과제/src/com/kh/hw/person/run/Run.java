package com.kh.hw.person.run;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Person;
import com.kh.hw.person.model.vo.Student;
import com.kh.hw.person.view.PersonMenu;

import om.kh.hw.person.controller.PersonController;

public class Run {

	public static void main(String[] args) {
	Person p = new Person();
	Employee e = new Employee();
	Student s =new Student();
	PersonMenu pb = new PersonMenu();
	
	PersonController pc = new PersonController();
	
	p.getName();
	
	
	
	
	}	
}
