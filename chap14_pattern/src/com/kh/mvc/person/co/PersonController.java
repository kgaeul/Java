package com.kh.mvc.person.co;

import com.kh.mvc.person.mo.PersonModel;
import com.kh.mvc.person.vo.PersonView;

public class PersonController {

	private PersonModel model;
	private PersonView view;
	
	public  PersonController(PersonModel model,PersonView view) {
		this.model=model;
		this.view=view;
	}
	public void character() {
		String username1 = view.getUser1();
		String username2= view.getUser2();
		model.setName(username1);
		model.setName2(username2);
		view.result(username1,username2);
	}
	
}
