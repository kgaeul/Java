package com.kh.Inheritance.calculator;

public class Calculator {
//	���� 
	
	int num1;
	int num2;
//	1. ���ϱ� 
	public int add(int num1,int num2) {//�Ű� ���� == �Ķ���� ���� �ΰ� �ֱ�
		return num1+num2;
	}
//	2. ���� 
	public int substruct(int num1,int num2) {//�Ű� ���� == �Ķ���� ���� �ΰ� �ֱ�
		return num1-num2;
	}
//	3. ���ϱ� 
	public int multifly(int num1,int num2) {//�Ű� ���� == �Ķ���� ���� �ΰ� �ֱ�
		return num1*num2;
	}
//	4. ������
	public int divide (int num1,int num2) {//�Ű� ���� == �Ķ���� ���� �ΰ� �ֱ�
		return num1/num2;
	}
	public int mod (int num1,int num2) {//�Ű� ���� == �Ķ���� ���� �ΰ� �ֱ�
		return num1%num2;
	}
}
