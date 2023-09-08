package com.kh.pattern.mvc;

import com.kh.pattern.mvc.Model.StudentModel;
import com.kh.pattern.mvc.controller.Studentcontroller;
import com.kh.pattern.mvc.view.Studentview;

public class StudentClient {

	
	public static void main(String[] args) {

		//모델 객체 생성
		StudentModel model = new StudentModel("김가을",24);
		
		Studentview view = new Studentview();
		
		Studentcontroller controller = new Studentcontroller(model,view);
		//뷰 객체 생성
		//컨트롤러 객체 생성(모델뷰 생성)
	
		controller.updateView();
		
		controller.setStudentName("이업데이트");
		controller.updateView();
		//학생 정보 업데이트를 하자!
		controller.setStudentName("이업데이트");
		controller.setStudentAge(18);
		//업데이트 된 학생 정보를 출력
		controller.updateView();
	
	}

	
	
	
	
}
