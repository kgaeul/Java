package com.kh.fileIO;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		pm.practice1();
		
	}
	
	public void practice1() {
	
		try {
			FileWriter writer = new FileWriter("C:\\Users\\user1\\Documents\\이걸 읽으면 안됩니다.txt");
			writer.write("[경] 당첨 [축] \n\n ~당신은 바보입니다~ \n 당신은 바보입니까? \n (1) YES \n (2) NO");
			writer.close();
	
			FileReader reader = new FileReader("C:\\Users\\user1\\Java_Workspace\\chap24_입출력(IO)\\src\\com\\kh\\fileIO\\abc.txt");
			BufferedReader br = new BufferedReader(reader);
			String line;
			while((line=br.readLine()) !=null){
				System.out.println(line);
			}
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
				
		}
	}
	public void practice2() {
		
	}
}
