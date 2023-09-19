package com.kh.RandomMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 Random 난수(무작위로 만들어진 수)를 생성하기 위해 사용되는 클래스
 */
public class RandomMain {

	public static void main(String[] args) {

		RandomMain randomMain = new RandomMain();
		
		randomMain.Lotto();
	//	randomMain.RandomExam();
		
	}
	public void Lotto() {
		Random rd = new Random();
		//ArrayList 사용해서 장바구니로 담기
		
		List<Integer> Lottonum= new ArrayList<>();
		//중복을 피하기 위해 set을 사용~~
		//6숫자만 들어갈 것!!!!!
		
		int six = 6;
		while(Lottonum.size()<six) {
			//1~45사이 범위를 지정해서 난수를 생성해야겠다.
			int ranNumber = rd.nextInt(45); //0~44자리의 랜덤으로 번호
			
			//존재하는 지 여부 중복X
			if(!Lottonum.contains(ranNumber)) {
				//!가 사라지면 값이 존재할 때만 list에 저장되는 것이기 때문에 무한루프
				Lottonum.add(ranNumber);
			}
			
		}
		System.out.println("로또번호 "+Lottonum+"");

		
	}
	public void RandomExam() {
		Random rd = new Random();
		
		int randint = rd.nextInt();
		System.out.println(randint);

		double rand = rd.nextDouble();
		System.out.println(rand);
		
		boolean randbool = rd.nextBoolean();
		System.out.println(randbool);
	}
	
}
