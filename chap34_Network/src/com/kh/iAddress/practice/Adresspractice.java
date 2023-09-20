package com.kh.iAddress.practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Adresspractice {

	public static void main(String[] args) {

		try {
			InetAddress address = InetAddress.getByName("www.maplestory.com");
			
			byte[]ipaddress=address.getAddress();
			for(byte ip : ipaddress)
			System.out.println("ip주소를 배열로 출력 : "+ip);
			System.out.println("호스트의 완전한 이름 : "+address.getCanonicalHostName());
			System.out.println(address.isMulticastAddress());
			System.out.println(address.getLoopbackAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
