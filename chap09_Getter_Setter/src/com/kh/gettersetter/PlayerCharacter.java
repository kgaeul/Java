package com.kh.gettersetter;

public class PlayerCharacter {

	private String name;//캐릭터 이름
	private int health;//체력
	private int attackPower;//공격 파워
	
	//데이터의 복사본을 던져주기 때문에 원래 객체의 데이터는 손상시키지 않음
	//원본데이터는 안전함
	
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getAttackPower() {
		return attackPower;
	}
	
	
	//Setter
	//외부에서 메소드를 통해 데이터에 접근을 하게 된다면 메소드는 매개값을 통해 검증해서 유효한 값만 데이터로 저장할 수 있음
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHealth(int health) {
		this.health = health;
		if(health>0) {
			this.health=health;
		}else {
			System.out.println("캐릭터가 사망했습니다.");
		}
	}
	
	public void setAttackPower(int attackPower) {
		if(attackPower>1) {
		this.attackPower = attackPower;
		}else {
			this.attackPower = attackPower;
			System.out.println("파워가 부적절합니다.");
		}
		
	
	}
	public void displayedInfo() {
		System.out.println("캐릭터명 : "+name);
		System.out.println("체력 : "+health);
		System.out.println("공격력 : "+attackPower);
	}
	//캐릭터 공격하는 출력 메서드
	int damage=20;
	public void attack(PlayerCharacter target) {
			System.out.println(name+"이"+name+"를 공격했습니다. "+target.damage+"데미지를 줬습니다!");
		
	}
	public void takeDamage(int damage) {
		System.out.println("공격받았습니다. ");
		
		
		
}
}