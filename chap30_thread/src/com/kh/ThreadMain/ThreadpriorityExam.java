package com.kh.ThreadMain;

public class ThreadpriorityExam {

	public static void main(String[]args) {
		
		StudentThread st1 = new StudentThread("�л� 1");
		StudentThread st2 = new StudentThread("�л� 2");
		
		//�����忡 �켱���� ����
		
		st1.setPriority(Thread.MAX_PRIORITY); //�켱������ �ִ�� �����ϰھ�!!!!!!!!!
		st2.setPriority(Thread.MIN_PRIORITY); //�켱������ �ּҷ� �����ϰھ�!!!!!!!!!
		
		//������ ����
		st1.start();
		st2.start();
	}
}