package array;

import java.util.Scanner;

public class Animal {
	
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	      
	        if (n%2==0){
	            System.out.print(n+" is even");
	        }else if(n%2==1){
	            System.out.print(n+" is odd");
	     
	        }
	    }
	
}

클래스와 클래스간의 계약을 정의하는 추상 데이터 유형
클래스의 행동을 정의하고 클래스가 특정 메서드를 반드시 구현해야함을 강제

메서드 선언만 포함

메서드의 이름, 매개변수 및 반환 유형만 선언
메서드의 구현 내용은 제공하지 않음

추상 메서드만 포함
 모든 메서드는 추상 메서드로 선언되어있기 때문에
 메서드 본문이 없고 메서드를 호출하면
 해당 인터페이스를 구현하는 클래스에서 정의된 메서드 실행
 
 다중 상속 지원
 
 클래스는 하나의 클래스만 상ㅅ