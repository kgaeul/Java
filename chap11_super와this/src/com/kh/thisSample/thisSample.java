package com.kh.thisSample;
/*
 this �ν��Ͻ� �ڽ��� ����Ű�� �������� �ν��Ͻ��� �ּҰ� ����
 int x=10;
		int y=x;
		
		int[] list1= {1,2,3};
		
		int[] list2= list1;
 this ��ü(=�ν��Ͻ�) �ڽ��� ����Ű�� �������� ��ü�� �ּҰ� ����
 this() ���� Ŭ������ �ٸ� �����ڸ� ȣ���ϴ� �� ���
 
 * */
class Myclass{
	int myfield;
	
	//ù ��° ������ ����
	
	Myclass(){
		this(0);//this �� ����ؼ� �ٸ� ������ ȣ��
	}
	//�� ��° ����
	Myclass(int value){
		this.myfield=value;
}

	void printvalue() {
		System.out.println("myfield�� �� : "+this.myfield);
	}
}
public class thisSample {

	
	public static void main (String[]args) {
		Myclass obj1=new Myclass();//ù ��° ������ ȣ��
		Myclass obj2=new Myclass(1278721389);//�� ��° ������ ȣ��
		
		obj1.printvalue();
		obj2.printvalue();
	}
	
}
