package com.kh.instance.cafe;

import com.kh.instance.americano.Americano;

public class CafeMain {

	public static void main(String[] args) {

	Cafe americano = new Cafe("americano",1,false) ;
	Cafe latte = new Cafe("latte",2,true) ;
	Cafe juice = new Cafe("juice",3,false) ;
	Cafe milk = new Cafe("milk",4,true) ;

	americano.makeCoffee();
	latte.makeCoffee();
	juice.makeCoffee();
	milk.makeCoffee();
	}
	
	
	

}
