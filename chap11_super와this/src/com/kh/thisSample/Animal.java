package com.kh.thisSample;

class MyAnimal{
	String Rabbit;
	int age;
	String favorite;
	
	MyAnimal(){
		this("귀여운 토깽이", 5, "당근");
	}
	MyAnimal(String pet,int age,String favorite){
		this.Rabbit=pet;
		this.age=age;
		this.favorite=Rabbit;
	}
	void Mypetname(){-
		System.out.println("동물의 이름은 "+this.Rabbit+"입니다.");
		System.out.println(this.Rabbit+"의 나이는 "+this.age+"살 입니다.");
		System.out.println(this.Rabbit+"의 최애 먹이는 "+this.favorite+"입니다.");
	}
}
public class Animal {

	public static void main(String[]args) {
		MyAnimal animal = new MyAnimal("깡총깡총 토깽이",3,"오이");
		MyAnimal animal2 = new MyAnimal();
		
		animal.Mypetname();
		animal2.Mypetname();
	}

		
	}
	

