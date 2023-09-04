package com.kh.ClassSample;

public class StudentMain {

	public static void main(String[] args) {

		//학생의 객체를 생성
		//학생의 정보 출력
		Student student1=new Student("김가을",24,"1학년");
		Student student2=new Student("김어텀",23,"2학년");
		Student student3=new Student("김폴",21,"3학년");
				
		student1.displayInfo();
		student2.displayInfo();
		student3.displayInfo();
		
		
	}

}
