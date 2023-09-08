package com.kh.pattern.mvc;

import com.kh.pattern.mvc.comtroller.userController;
import com.kh.pattern.mvc.comtroller.userModel;
import com.kh.pattern.mvc.comtroller.userView;

public class UserClient {

	public static void main(String[] args) {
		//MVC 패턴을 사용해서 학생 정보를 다루는곳
		//모델 객체 생성
		userModel user  = new userModel ("김가을",24);
		//뷰 객체 생성
		//학생 정보를 업데이트해서 출력
		//학생정보 업데이트를 하자
		//업데이트된 학생정보를 출력
		
		userView view = new userView();
		
		
		userController controller = new userController (user,view);
		
		controller.updateview();
		controller.updateview();
		controller.updateview();
		
		
		
	}

}
