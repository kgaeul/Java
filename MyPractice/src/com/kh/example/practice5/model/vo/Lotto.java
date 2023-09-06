package com.kh.example.practice5.model.vo;

public class Lotto {

	int Lotto;
	int lottonum;
	
	public Lotto() {
	}
		public void information() {
			int []Lotto = new int[6];
			Lotto[0]=15;
			Lotto[1]=36;
			Lotto[2]=21;
			Lotto[3]=17;
			Lotto[4]=8;
			Lotto[5]=45;
		for(int i=0;i<6;i++) {
			System.out.println(Lotto[i]);
		}
	}
}
