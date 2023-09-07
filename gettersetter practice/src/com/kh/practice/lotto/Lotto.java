package com.kh.practice.lotto;

public class Lotto {

	int Lotto;
	
	public int getLotto() {
		return Lotto;
	}
	public void setLotto(int lotto) {
		Lotto = lotto;
	}
		public void information() {
			int []Lotto = new int[6];
			Lotto[0]=15;
			Lotto[1]=36;
			Lotto[2]=21;
			Lotto[3]=16;
			Lotto[4]=9;
			Lotto[5]=44;
		for(int i=0;i<Lotto.length;i++) {
			System.out.println(Lotto[i]);
		}
	}
}		
