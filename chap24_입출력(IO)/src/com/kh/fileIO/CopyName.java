package com.kh.fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyName {

	public static void main(String[] args) {

		String inputFile1="C:\\Users\\user1\\Pictures\\socute.png";
		String outputFile = "C:\\Users\\user1\\Desktop\\너무귀여워!!!!.png";
		
		String inputFile2="C:\\Users\\user1\\Pictures\\cute1.png";
		String outputFile2 = "C:\\Users\\user1\\Desktop\\너무귀여워!!!!!.png";
		
		String inputFile3="C:\\Users\\user1\\Pictures\\cute2.png";
		String outputFile3 = "C:\\Users\\user1\\Desktop\\너무귀여워!!!!!!.png";
		
		try (FileInputStream fis = new FileInputStream(inputFile1); 
				FileOutputStream fos = new FileOutputStream(outputFile)) {
			byte[]buffer = new byte[1024];
			int byteRead;
			
			//파일을 읽고 복사하는 동안 사용됨
			//fis.read(buffer)파일에서 데이터를 읽어들이고
			//fos.write(buffer,0,byteRead) 읽어들인 데이터를 출력함
			//파일의 끝에 도달하면 -1 반환하면서 while 종료
			while((byteRead=fis.read(buffer)) !=-1) {
				fos.write(buffer,0,byteRead);
			}
				System.out.println("파일이 복사되었습니다.!");
				
		} catch (IOException e) {
			e.printStackTrace();
		}
			/////////////////////////////////////////////////
		try (FileInputStream fis = new FileInputStream(inputFile2); 
				FileOutputStream fos = new FileOutputStream(outputFile2)) {
			byte[]buffer = new byte[1024];
			int byteRead;
			while((byteRead=fis.read(buffer)) !=-1) {
				fos.write(buffer,0,byteRead);
			}
				System.out.println("파일이 복사되었습니다.!");
				
		} catch (IOException e) {
			e.printStackTrace();
		}
		////////////////////////////////////////////////////////
		try (FileInputStream fis = new FileInputStream(inputFile3); 
				FileOutputStream fos = new FileOutputStream(outputFile3)) {
			byte[]buffer = new byte[1024];
			int byteRead;
			while((byteRead=fis.read(buffer)) !=-1) {
				fos.write(buffer,0,byteRead);
			}
				System.out.println("파일이 복사되었습니다.!");
				
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
