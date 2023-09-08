package com.kh.pattern.mvc.controller;

import com.kh.pattern.mvc.Model.StudentModel;
import com.kh.pattern.mvc.view.Studentview;


public class Studentcontroller {

	private StudentModel studentModel;
	private Studentview studentview;
	
	public Studentcontroller(StudentModel studentModel,Studentview studentview) {
		this.studentModel=studentModel;
		this.studentview=studentview;
	}

		public void setStudentName(String name) {
			studentModel.setName(name);
		}
		public void setStudentAge(int age) {
			studentModel.setAge(age);
		
		}
		public String getStudentName() {
			return studentModel.getName();
		}
		public int getStudentAge() {
			return studentModel.getAge();
		}

		public void updateView() {
			//DB에 변경될 값 추가
			studentview.displayInfor(studentModel.getName(), studentModel.getAge());
		}
}

