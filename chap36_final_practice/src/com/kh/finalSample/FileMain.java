package com.kh.finalSample;

import java.io.*;

public class FileMain {

	public void fileSave(String filename,Food food) throws Exception {
		//전달받은 fileName으로 파일 객체 생성
		FileOutputStream FOStream = new FileOutputStream(filename);
		
		//파일 객체와 연결하는 파일 출력 스트림
		ObjectOutputStream objStream = new ObjectOutputStream(FOStream);
		
		
		//파일에 FOOD 객체를 기록
		objStream.writeObject(food);
		
		//스트림을 닫음
		objStream.close();
		
		FOStream.close();
		
		System.out.println("food 객체를 파일에 저장했습니다.");
	}
	
	public static void main(String[]args) throws Exception {
		FileMain fm = new FileMain();
		Food foodSample = new Food("사과",20);
		fm.fileSave("food.txt", foodSample);
	}
}
