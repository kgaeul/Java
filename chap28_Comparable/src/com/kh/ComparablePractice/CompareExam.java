package com.kh.ComparablePractice;

public class CompareExam implements Comparable <CompareExam>{

	private String name;
	private String job;
	private int age;
	private String gender;
	
	public CompareExam (String name, String job, int age,String gender) {
		this.name= name;
		this.job=job;
		this.age=age;
		this.gender=gender;
	}
	@Override
	public int compareTo(CompareExam other) {
		return this.age -other.age;
		
	}
	@Override
	public String toString() {
		return "Cellebrity {이름 : [" + name+"] , 직업 : ["+job + "], 나이 : ["+age+"]세 + 성별 : ["+gender+"]}";
		
	}
	
}
