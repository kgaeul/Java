package com.kh.Practice;

import java.io.File;

public class File_rename_Main {

	public static void main(String[] args) {

		String mainPath = "C:\\Users\\user1\\Pictures\\";
		String originFile = mainPath+"cute1.png";
		
		//파일 객체 생성
		File fileToDelete = new File(originFile);
		
		//파일 삭제
		boolean deleted = fileToDelete.delete();
		
		if(deleted) {
			System.out.println("파일을 성공적으로 삭제했엉");
		}else {
			System.out.println("파일삭제 못했어 엉엉");
		}
		
	}

}
