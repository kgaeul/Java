package com.kh.fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MakeFolderMain {

	public static void main(String[] args) {
		MakeFolderMain MakeFolder = new MakeFolderMain();
		MakeFolder.practice1();
	}
		public void practice1() {
		
			File f = new File("C:\\Users\\user1\\Desktop\\열지마세요\\절대 열지 마세요\\진짜 진짜 열지 마세요\\마지막으로 말하는데 진짜 열지 마세요");
			
			
			if(!f.exists()) {
				f.mkdir();
				System.out.println("폴더를 만들었습니다.");
			}else {
				System.out.println("폴더가 이미 있습니다.");
			}
			
			try {
				FileWriter fw = new FileWriter("C:\\Users\\user1\\Desktop\\열지마세요\\절대 열지 마세요\\진짜 진짜 열지 마세요\\"
												+ "마지막으로 말하는데 진짜 열지 마세요\\진짜 여실거죠.txt");
				fw.write("열지마라했잖아요 \n");
				fw.write("-_-");
				fw.close();
		
				FileReader reader = new FileReader("C:\\Users\\user1\\Desktop\\열지마세요\\절대 열지 마세요\\진짜 진짜 열지 마세요\\"
						+ "마지막으로 말하는데 진짜 열지 마세요\\진짜 여실거죠.txt");
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
