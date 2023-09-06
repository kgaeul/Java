package com.kh.gettersetter.goodexam;

public class GoodPlayer {

	private String name;	//캐릭터 이름
	public void setName(String name) { //이름이 변경되면 저장될 set
		this.name = name;
		
	}
	//검증하는 valid
	public void ValidName() { //캐릭터 이름에 공백에 없는 지 검증
		if(this.name==" ") {
			this.name="No name";
		}
	}
	
	public String getName() { //캐릭터 이름을 반환
		return name;
	}
	
	private int health;		//체력
	public void setHealth(int health) {
		this.health = health;
	}
	public void ValidHealth() {
		//체력이 0이라면 0으로 표기
		if(health<=0) { //체력이 0이하일 경우
			this.health = 0;
			System.out.println(name+" 캐릭터가 사망했습니다.");
		}
	}
	public int getHealth() {
		return health;
	}
	
	private int attackPower;//공격 파워
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	public void ValidattackPower() {//무결성 되게 검증
		//만약에 파워가 0보다 작을 경우
		if(attackPower<=0) {
			this.attackPower = 0;
		}
	}
		public int getAttackPower() {
			return attackPower;
	}
		
		public void display() {
			System.out.println("캐릭터 정보 : "+this.name);
			System.out.println("체력 정보 : "+this.health);
			System.out.println("공격력 : "+this.attackPower);
		}
}
