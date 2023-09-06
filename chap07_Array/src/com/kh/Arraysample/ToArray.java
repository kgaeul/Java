package com.kh.Arraysample;

public class ToArray {

	public static void main(String[] args) {

		//이중 문자열 배열 선언과 초기화
							//0		1		2
		String[][] fruits = 
							{{"사과","바나나","체리"}, //0
						//{"포도","오렌지","딸기"}, //1
							{"망고","수박","레몬"} //2
		};
			for(int i=0; i<fruits.length;i++) {
				System.out.print(fruits.length);
				System.out.print(fruits[i].length);
				System.out.println();
				for(int a=0; a<fruits[i].length;a++) {
					System.out.print(a +":"+fruits.length);
					System.out.print(fruits[a].length);
					System.out.print(fruits[i][a]+" ");
			}
			System.out.println(); //다음 행으로 이동할 수 있게 enter용 출력 메소드 입력
		}
	}
}
