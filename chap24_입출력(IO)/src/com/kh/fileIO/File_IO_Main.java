package com.kh.fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_IO_Main {

	public static void main(String[] args){
		
		try {
			FileWriter writer = new FileWriter("2023-09-14.txt");
			writer.write("파일 덮어지는 지 확인");
			writer.close();
			
			FileReader reader = new FileReader("abcde.txt");
			
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

}
