package com.kh.pattern.mvc.view;
import com.kh.pattern.mvc.controller.Studentcontroller;
import com.kh.pattern.mvc.Model.StudentModel;

public class Studentview {

	public static void main(String[] args) {
		// 모델 객체 생성 Model
		StudentModel model = new StudentModel("박학생",17);
		//  뷰 객체 생성 View
		Studentview view = new Studentview();
		// 컨트롤러 객체 생성 Controller(모델 뷰 설정)
		Studentcontroller controller = new Studentcontroller(model, view);
		//학생 정보를 업데이트해서 출력
		controller.updateView();
		//학생 정보 업데이트를 하자!
		controller.setStudentName("이업데이트");
		controller.setStudentAge(18);
		//업데이트 된 학생 정보를 출력
		controller.updateView();
	}

	public void displayInfor(String name, int age) {
		// TODO Auto-generated method stub
		
	}

	}


