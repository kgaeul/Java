package com.kh.Operator;

public class comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//4. 비교연산자 : 값을 비교할 때 사용
		/*
		 크기 비교, 등호 비교 등을 수행가능
		 두 개의 항 중 어느 것이 더 큰지 , 더 작은 지, 같은 지, 다른 지의 여부를 판단함
		 비교 연산자의 결과 값은 참(true) 또는 거짓 (false)으로 반
		 > 왼쪽 항이 크면 참, 아니면 거짓을 반환 미만 초과
		 < 오른 쪽 항이 크면 참 ,아니면 거짓을 반환 미만 초과
		 >= 왼쪽 항이 오른쪽 항보다 크거나 같으면 참, 아니면 거짓을 반환
		 <= 왼쪽 항이 오른쪽 항보다 작거나 같으면 참, 아니면 거짓을 반환
		 == 두 항의 값이 같으면 참, 아니면 거짓을 반환 ex)num ==5
		 != 두 항의 값이 다르면 참, 아니면 거짓을 반환 num!=5

		 */
		int p =5;
		int q =10;
		
		System.out.println("boolean을 넣지 않음 : "+ (p==q));//false랑 true만 나옴
		boolean isEqual =p ==q;
		System.out.println(isEqual);
		int r =5;
		System.out.println(p==r); //값이 5로 동일하기 때문에 true로 반환
		
		boolean isEqual1=p!=q;
		System.out.println(isEqual1);
		System.out.println(p<=q);
		System.out.println(p>=r);
		
		boolean isEqual2 =p!=r;
		System.out.println(isEqual2);
		
		
		
		

	}

}
