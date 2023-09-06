package com.kh.gettersetter.goodexam;


public class gamerun {

	public static void main(String[] args) {

		GoodPlayer Player = new GoodPlayer();
		
		Player.setName("[바보]") ;
		
		Player.setHealth(100);//100체력을 저장해주고
		Player.ValidHealth();//-10이 무결성(내가 만든 코드가 결점이 없는 지)인지 검증한다.
		
		Player.setAttackPower(0) ;
		Player.ValidattackPower() ;
		Player.ValidName();
		Player.display();
		
		
		System.out.println("---------------------");
		
		
		GoodPlayer Player2 =new GoodPlayer();
		Player2.setName("[멍청이]") ;
		Player2.setHealth(0);
		Player2.setAttackPower(10) ;
		Player2.ValidHealth();
		Player2.ValidattackPower() ;
		Player2.ValidName();
		Player2.display();
	}

}
