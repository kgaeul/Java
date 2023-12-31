package com.kh.thisSample;
/*
 this 인스턴스 자신을 가리키는 참조변수 인스턴스의 주소가 저장
 		int x=10;//지역변수
		int y=x;//참조변수
		String seuol ="서울시";
		String myPlace = seuol;
		int[] list1= {1,2,3};
		
		int[] list2= list1;
 this 객체(=인스턴스) 자신을 가리키는 참조변수 객체의 주소가 저장
 this() 현재 클래스의 다른 생성자를 호출하는 데 사용
 
 	인스턴스변수
 
 * */
class Myclass{
	int myfield; // = this.Myfield
	
	//첫 번째 생성자 생성
	
	Myclass(){
		this(1000);//this 를 사용해서 다른 생성자 호출
	}
	
	Myclass(int value){
		this.myfield=value;
}//두 번째 생성

	void printvalue() {
		System.out.println("myfield의 값 : "+this.myfield);
	}
}
public class thisSample {

	
	public static void main (String[]args) {
		Myclass obj1=new Myclass();//첫 번째 생성자 호출
		Myclass obj2=new Myclass(101);//두 번째 생성자 호출
		
		obj1.printvalue();
		obj2.printvalue();
	}
	
}
