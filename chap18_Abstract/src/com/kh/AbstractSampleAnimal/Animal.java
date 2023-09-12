package com.kh.AbstractSampleAnimal;

public class Animal {
	
	String name;
	String sound;
	String 먹이;
	int 나이;
	
	
	
	 public Animal(String name, String sound,
			 		String 먹이,int 나이) {
		this.name=name;
		this.sound=sound;
		this.먹이=먹이;
		this.나이=나이;
		
	}
	 
	 public String infor() {
	 return (name+"는 "+sound+" 소리를 냅니다. 먹이는 "+먹이+"를 먹습니다. "
	 +name+"의 나이는 "+나이+"살입니다. ");
	 }
	
}
