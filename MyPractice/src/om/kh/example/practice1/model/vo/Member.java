package om.kh.example.practice1.model.vo;

public class Member {

	String memberId;
	String memberPwd;
	String memberName; 
	int age;
	char gender;
	String phone; 
	String email; 
	
	public Member(String memberId,String memberPwd,String memberName,int age,char gender,String phone,String email) { 

	this.memberId=memberId;
	this.memberPwd=memberPwd;
	this.memberName=memberName;
	this.age=age;
	this.gender=gender;
	this.phone=phone;
	this.email=email;
	
	}
	public void memberIdname() {
		System.out.println("아이디 : "+memberId);
	}
	public void memberPwdname() {
		System.out.println("비밀번호 : "+memberPwd);
	}
	public void memberNamename() {
		System.out.println("이름 : "+memberName);
	}
	public void agename() {
		System.out.println("나이 : "+age);
	}
	public void gendername() {
		System.out.println("성별 : "+gender);
	}public void phonename() {
		System.out.println("핸드폰 번호 : "+phone);
	}
	public void emailname() {
		System.out.println("이메일 : "+email);
	}
	
		
		
	
}
