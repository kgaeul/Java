package com.kh.Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PracticeCopy {

	public static void main(String[] args) {

		String input = "C:\\Users\\user1\\Pictures\\abc.png";
		String output = "C:\\Users\\user1\\Desktop\\나는 레서판다다!!!!!!.png";
		
		try (FileInputStream fis = new FileInputStream(input);
				FileOutputStream fos = new FileOutputStream(output)){
			
			byte[]buffer = new byte[1024];
			int Readbyte;
			
			while((Readbyte=fis.read(buffer))!=-1) {
				fos.write(buffer,0,Readbyte);
			}
			System.out.println("파일복사완료");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File file = new File("C:\\Users\\user1\\Desktop\\누구게");
		
		boolean success = file.mkdirs();
		if(success) {
			file.mkdirs();
			System.out.println("파일 만들어따~~");
		}else {
			System.out.println("파일 못만들어따ㅠㅠ");
		}
		
		
		String input2 = "C:\\Users\\user1\\Desktop\\나는 레서판다다!!!!!!.png";
		String output2 = "C:\\Users\\user1\\Desktop\\누구게\\나는 레서판다다!!!!!!.png";
		
		try (FileInputStream fis = new FileInputStream(input2);
			FileOutputStream fos =new FileOutputStream(output2))	{
			
			byte[]buffer = new byte[1024];
			int Readbyte;
			while((Readbyte=fis.read(buffer))!=-1) {
				fos.write(buffer,0,Readbyte);
			}
			System.out.println("파일저장완료");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
