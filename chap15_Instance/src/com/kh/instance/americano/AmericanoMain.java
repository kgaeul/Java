package com.kh.instance.americano;

public class AmericanoMain {

	public static void main(String[] args) {
		//사이즈 설탕 여부
		Americano client1 = new Americano(1,false) ;
			client1.makeCoffee();
		
		Americano client2 = new Americano(1,false) ;
		client1.makeCoffee();
		
		Americano client3 = new Americano(1,false) ;
		client1.makeCoffee();
		
		Americano client4 = new Americano(1,false) ;
		client1.makeCoffee();


}
}