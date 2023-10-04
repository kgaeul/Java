package com.kh.finalSample;

import java.io.FileWriter;

public class FileIOMain {
	public static void main(String[] args) {
		FileIOMain fm = new FileIOMain();
		fm.practice();
	}
	
	public void practice() {
	try {
	FileWriter fw= null;
	fw = new FileWriter("¿¨.txt",true);
	fw.write("1000");
	fw.write(10000);
	fw.close();
	System.out.println("Ãß°¡¿Ï·á");
	}catch (Exception e){
		e.printStackTrace();
		}
	}
}
