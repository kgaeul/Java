package com.kh.finalSample;

import java.security.Permission;

public class PersonMain {


	private String name;

	public PersonMain(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		
		 PersonMain[] pArray = new PersonMain[3];
		 pArray[0] = new PersonMain("kh");
		
		for(int i = 0; i<pArray.length;i++) {
			System.out.print(pArray[0].getName());
		}
	}

}
