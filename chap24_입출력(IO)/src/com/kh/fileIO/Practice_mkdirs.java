package com.kh.fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practice_mkdirs {

	public static void main(String[] args) {

		Practice_mkdirs pm = new Practice_mkdirs();
		pm.practice();
		pm.practice2();
		pm.practice3();
		
	}
		public void practice(){
	
			File file = new File("C:\\Users\\user1\\Desktop\\바보\\입니다");
			
			boolean success = file.mkdirs();
			
			FileWriter fw;
			try {
				fw = new FileWriter("C:\\Users\\user1\\Desktop\\바보\\입니다\\사실인가요.txt");
				fw.write("네 충격적이게도 사실입니다. ");
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			FileReader fr;
			try {
				fr = new FileReader("C:\\Users\\user1\\Desktop\\바보\\입니다\\사실인가요.txt");
				String line;
				BufferedReader br = new BufferedReader(fr);
				while((line=br.readLine()) !=null){
					System.out.println(line);
				}
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
			
			
			if(success) {
				System.out.println("파일 만들어따!!!!!!");
			}else{
				System.out.println("파일 못만들어따 ㅠㅠ");
			}
			
					
			
		}
		public void practice2() {
			File file2 = new File("C:\\Users\\user1\\Java_Workspace\\chap25");
			
			boolean success = file2.mkdirs();
			
			FileWriter fw;
			try {
				fw = new FileWriter("C:\\Users\\user1\\Java_Workspace\\chap25\\바보입니다.txt");
				fw.write("네 충격적이게도 맞습니다. ");
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			FileReader fr;
			try {
				fr = new FileReader("C:\\Users\\user1\\Java_Workspace\\chap25\\바보입니다.txt");
				String line;
				BufferedReader br = new BufferedReader(fr);
				while((line=br.readLine()) !=null){
					System.out.println(line);
				}
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(success) {
				System.out.println("파일 만들어따!!!!!!");
			}else{
				System.out.println("파일 못만들어따 ㅠㅠ");
			}
		}
		
		public void practice3() {
			File file3 = new File("C:\\Users\\user1\\Documents\\myPlace\\Music\\Korean\\kpop\\group");
		
			boolean success = file3.mkdirs();
			FileWriter fw;
			try {
				fw = new FileWriter("C:\\Users\\user1\\Documents\\myPlace\\Music\\Korean\\kpop\\group\\스펀지밥과 뚱이.txt");
				fw.write("사랑해요오~");
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			FileReader fr;
			try {
				fr = new FileReader("C:\\Users\\user1\\Documents\\myPlace\\Music\\Korean\\kpop\\group\\스펀지밥과 뚱이.txt");
				String line;
				BufferedReader br = new BufferedReader(fr);
				while((line=br.readLine()) !=null){
					System.out.println(line);
				}
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(success) {
				System.out.println("파일 만들어따!!!!!!");
			}else {
				System.out.println("파일 못만들어따 ㅜㅜ");
			}
			
			
		}
}
