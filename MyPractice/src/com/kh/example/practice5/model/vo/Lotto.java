package com.kh.example.practice5.model.vo;

public class Lotto {

	int lotto;
	int lottonum;
	
	public Lotto() {
		
		int []lotto = new int[6];
		lotto[0]=15;
		lotto[1]=36;
		lotto[2]=21;
		lotto[3]=17;
		lotto[4]=8;
		lotto[5]=45;
		for(int i=0;i<6;i++) {
			lottonum=lotto[i];
			System.out.println(lotto[i]);
		}
	
	}
	public void information() {
		System.out.println(lottonum);

		
	}
}
