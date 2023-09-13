package com.kh.api.exam1;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 p= new PracticeMain2();
		
		p.practice1();
		p.practice2();
		p.practice3();
		p.practice4();
		p.practice5();

	}
	public void practice1() {
		//¹®ÀÚ¿­ µ¡ ºÙÀÌ±â Ãâ·Â append È°¿ë 
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã "); //¿À´Ã Àú³áÀº ¹¹¸ÔÁö?
		sb.append("Àú³áÀº ");
		sb.append("¹¹");
		sb.append("¸Ô¿ì±ø? ");

		System.out.println(sb.toString());
		
	}
	public void practice2() {
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã Àú³áÀº ¹¹¸ÔÁö?");
		System.out.println(sb.toString());
		
	}
	public void practice3() {
		String str = ("¿À´Ã Àú³áÀº ¹¹¸¦ ¸ÔÀ»±î?");
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb.toString());
	}
	
	public void practice4() {
		//¹®ÀÚ¿­ µ¡ ºÙÀÌ±â Ãâ·Â append È°¿ë 
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã Àú³áÀº ¹¹¸¦ ¸ÔÀ»±î?"); //¿À´Ã Àú³áÀº ¹¹¸ÔÁö?
		sb.insert(14,"¤¾¤¾");
		System.out.println(sb.toString());
		
	}
	public void practice5() {
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã Àú³áÀº ¹¹¸ÔÁö?");
		sb.delete(9,10);
		//nºÎÅÍ m ±îÁö Áö¿öÁÖ´Â ¾Ö
		sb.insert(9,"¾î");
		System.out.println(sb.toString());
		
	}

}
