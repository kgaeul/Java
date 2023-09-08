package com.kh.pattern.mvc;

public class MVCStudent {

	private String name;
	private int age;
	
	public MVCStudent(String name, int age) {
	this.name= name;
	this.age= age;
	
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}

	//2 controller
	
public class SController {
		private MVCStudent model;
			private MVCStudent view;
			
		public MVCStudent getModel() {
				return model;
			}
			public void setModel(MVCStudent model) {
				this.model = model;
			}
			public MVCStudent getView() {
				return view;
			}
			public void setView(MVCStudent view) {
				this.view = view;
			}
		public  SController() {
			this.model= model;
			this.view= view;
		}
		public void updateview() {
			view.printinfo();
		
	}	
	}
		//3 view
		public void printinfo() {
			System.out.print("학생들의 정보 : "+name+age);
	}

	public static void main(String[] args) {

		MVCStudent m =new MVCStudent("김가을",24);
		 m.printinfo();
	
	}

}
