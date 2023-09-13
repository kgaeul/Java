package com.kh.api.exam1;

public class ReplaceMain {

	public static void main(String[] args) {
		ReplaceMain rm = new ReplaceMain();
		rm.replace2();
		rm.replace3();
		rm.replace4();
		rm.replace5();
		rm.replace6();
//		String input = " Hellow, world ";
//		String reInput = input.replace(" ","-");
//		System.out.println(reInput);
//		
//		String input2= reInput.replace("-"," ");
//		System.out.println(input2);
		}
	public void replace2() {
		String input = " Hellow, world ";
		String reInput = input.replace("world","Java");
		System.out.println(reInput);
	
	}
	
	public void replace3() {
		String originName = " Hellow, world ";
		String reInput = originName.replace("o","x");
		System.out.println(reInput);
	}
	
	public void replace4() {
		String originString = "the quick brown fox jumps over the lazy dog";
		String reInput = originString.replace("fox","cat");
		System.out.println(reInput);
	}
	
	public void replace5() {
		String originString = "the quick brown fox jumps over the lazy dog";
		String reInput = originString.replace(" ","");
		System.out.println(reInput);
	}
	public void replace6() {
		String originString = "Hellow, world ";
		String reInput = originString.replaceAll("(?i)Hellow","Java");
		System.out.println(reInput);
	}
	
}
