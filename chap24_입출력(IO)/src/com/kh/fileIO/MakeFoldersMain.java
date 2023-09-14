package com.kh.fileIO;

import java.io.File;

public class MakeFoldersMain {

	public static void main(String[] args) {

		//mkdirs
		//바탕화면에 kh폴더를 만들고 이미지 파일 생성
		//부모 디렉토리가 존재하지 않는 경우에 중간 모든 디렉토리 생성
	
		File dir = new File("C:\\Users\\user1\\Desktop\\열\\지\\마\\셈");
		
		//mkdirs 메서드 사용하여 디렉토리 생성 시도
		boolean success = dir.mkdirs();
		
		if(success) {
			System.out.println("폴더만들어따~~");
		}else {
			System.out.println("못만들어따 ㅠㅠ");
		}
		
		
	}

}
