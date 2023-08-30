package com.kh.Operator;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//대입 연산자 : 변수에 값을 대입할 때 사용

		//<<복합 대입 연산자>>
		/*
		 변수의 현재 값과 다른 값을 계산하여 변수에 저장하는 연산자
		 코드를 좀 더 간결하게 작성하고 읽기 쉽게 만들 수 있다.
		 += 덧셈 후 대입 
		 -= 뺄셈 후 대입
		 *= 곱셈 후 대입
		 /= 나눗셈 후 대입
		 %= 나머지 후 대입
		 &= 비트 AND 후 대입
		 |= 비트 OR 후 대입
		 ^= 비트 XOR 후 대입
		 <<= 왼쪽 SHIFT 후 대입
		 >>= 오른쪽 SHIFT 후 대입
		 */
		
		int a =10;
		a += 5; //a=a+5
		System.out.println(a);
		
		int b= 20;
		b -= 3; //b=b-3
		System.out.println(b);
		
		int c=8;
		c*=2; //c=c*2
		System.out.println(c);
		
		int d = 50;
		d/= 10; //d=d/10
		System.out.println(d);
		
		int e =25;
		e %=7;
		System.out.println(e);
		
		
		
	}

}
