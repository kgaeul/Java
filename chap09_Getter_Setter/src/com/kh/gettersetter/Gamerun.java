package com.kh.gettersetter;

public class Gamerun {

	public static void main(String[] args) {

		//플레이 생성자 만들기
		
		PlayerCharacter Player = new PlayerCharacter();
		
		
		Player.setName("[KH]") ;
		Player.setAttackPower(20) ;
		//Player.takeDamage();
		Player.setHealth(20);
		
		Player.displayedInfo() ;
		
		PlayerCharacter Player2 =new PlayerCharacter();
		Player2.setName("[ㅎㅎㅎ]") ;
		Player2.setAttackPower(10) ;
		//Player.takeDamage();
		Player2.setHealth(80);
		
		Player2.displayedInfo() ;
		
		System.out.println("attack!!!!!!!!!!!");
		Player.attack(Player2);
		//Player2.setHealth(0);
		
		
	}

}
