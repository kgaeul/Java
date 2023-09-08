package com.kh.mvc.person.vo;
import java.util.Scanner;

public class PersonView {
	Scanner sc =new Scanner(System.in);
	
	String n=sc.next();
	String n2=sc.next();
	
	public String g¤§tUser1() {
		String name1= n;
		return name1;
	}
	public String getUser2() {
		String name2= n2;
		return name2;
	}
	public void result(String Personname1,String Personname2) {

		System.out.println(Personname1+" "+Personname2);
		
	}
}