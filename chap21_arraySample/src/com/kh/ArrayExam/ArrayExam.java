package com.kh.ArrayExam;

import java.util.Scanner;

public class ArrayExam {

//		public void practice1() {
//		int value = 1;
//		int[][]arr = new int[4][4];
//		
//		for( int i = 0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j]=value++;
//				System.out.print(arr[i][j]+" ");
//			}
//		}
//	}
//printf =출력 후 줄바꿈 하지 않음 줄바꿈 하려면 지시자 %n을 넣어줘야함
	//%b= boolean 형식으로 출력
		//%d 정수형식으로 출력
	//println %n 포함되어 있는 것

//		public void practice2(){
//			System.out.println();
//			int value = 16;
//			int[][]arr = new int[4][4];
//			
//			for( int i = 0;i<arr.length;i++) {
//				for(int j=0;j<arr[i].length;j++) {
//					arr[i][j]=value++;
//					System.out.print(arr[i][j]+" ");
//					
//				}
//			}
//
//			for(int i=0;i<arr.length;i++) {
//				for(int j=0;j<arr[i].length;j++) {
//					arr[i][j]=value++;
//					System.out.print(arr[i][j]+" ");
//			}
//		}
//	}

		public void practice3(){
			
			int row = 0;
			int col = 0;
			char value = 'a';
			char[][] arr = null;
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("행의 크기 : ");
			row=sc.nextInt();
			
			arr = new char[row][];
			
			for(int i=0;i<arr.length;i++) {
				System.out.println(i+" : 행의 크기");
				col=sc.nextInt();
				arr[i]=new char[col];
			}
			
			for(int i=0;i<arr.length;i++)  {
				for(int j=0;j<arr[i].length;j++) {
					arr[i][j]=value++;
				}
			}
			for(int i=0;i<arr.length;i++)  {
				for(int j=0;j<arr[i].length;j++) {
					arr[i][j]=value++;
					System.out.println(arr[i][j]+" ");
				}
			System.out.println();
		}
	}
}
