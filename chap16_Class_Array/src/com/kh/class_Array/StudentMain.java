package com.kh.class_Array;

public class StudentMain {

	public static void main(String[] args) {
		// Student를 저장는 배열 생성
		
		Student[] Student = new Student[3];
		
		//배열에 Student객체를 추가
		//[0] 인덱스 0 번째 학생부터 인덱스 [2] 학생까지 추가 저장하기
		Student[0] = new Student("홍길동",17);
		Student[1] = new Student("김가을",24);
		Student[2] = new Student("김댕댕",18);
		
		//총길이는 length 사용!!!!!
		
		//1번 째 학생의 이름 student[0].name
		//student[0].age
		
		for(int i=0;i<Student.length;i++) {
			
			System.out.println((i+1)+"번 째 학생의 이름은 "+Student[i].name+"이고 학생의 나이는 "+Student[i].age+ "세 입니다.");
			
			
		}
	
	}

}
