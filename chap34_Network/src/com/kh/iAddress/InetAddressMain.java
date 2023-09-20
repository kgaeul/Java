package com.kh.iAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {

	public void InetExam() { 
		try {
			//호스트 이름 이용해서 객체 생성
			InetAddress address = InetAddress.getByName("www.naver.com");
			
			//아이피 주소 출력
			System.out.println("Host Name : "+ address.getHostName());
			System.out.println("IP Address : "+ address.getHostAddress());
			
			//내 컴퓨터!!!!!!!! InetAddress 객체 얻기 => 가변적인 주소!
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("내 콤퓨타 이름 : "+localHost);
			System.out.println("내 컴퓨터 주소 : "+ localHost.getHostAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		try {
			InetAddress address2 = InetAddress.getByName("www.google.com");
			System.out.println("Host Name : "+ address2.getHostName());
			System.out.println("IP Address : "+ address2.getHostAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		try {
			InetAddress address3 = InetAddress.getByName("www.maplestory.com");
			System.out.println("Host Name : "+ address3.getHostName());
			System.out.println("IP Address : "+ address3.getHostAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	public void InetSample() { 
		try {
			InetAddress address = InetAddress.getByName("www.Daum.com");
			
			//ip주소를 바이트 배열로 얻기
			//ip 쥬솧를 바이트 배열로 얻으면 각 바이트를 통해 IP 주소를 다룰 수 있음
			
			byte[]ipAddress = address.getAddress();
			System.out.println("바이트로 얻음");
			
		for(byte ip : ipAddress) {
			System.out.print(ip+".");
		}
			
		InetAddress[] alladdress =InetAddress.getAllByName("www.Daum.com");
		System.out.println("구글에 지정된 모든 호스트의 아이피 주소를 배열로 모음");
		for(InetAddress addr : alladdress) {
			System.out.println(addr.getHostAddress());
		}
		
		
		//호스트 이름 얻기
		String HostName= address.getHostName();
		System.out.println("HostName : "+HostName);
		
		//지역 호스트의 ip 주소 얻기
		InetAddress localHost =InetAddress.getLocalHost();
		System.out.println("내컴퓨터 주소 : "+localHost.getHostAddress());
		
		//멀티 캐스트 주소 여부 확인
		boolean inMultiCast = address.isMulticastAddress();
		System.out.println(inMultiCast);
		
		//호스트 이름을 이용해서 InetAddress 객체 생성
		InetAddress name = InetAddress.getByName("www.maplestory.com");
		System.out.println(name.getHostAddress());
		
		//호스트의 완전한 이름 가져오기(전체 도메인 이름)
		//호스트의 정규화된 FQDN 도메인의 이름 얻음
		//FQDN = Full Qaulified Domain Name
		String hostfullName = name.getCanonicalHostName();
		System.out.println("풀네임:"+hostfullName);
		System.out.println(name.getHostName());
		
		//LookPask 주소 여부 확인
		//false랑 true로 출력
		boolean isLookPack = address.isLoopbackAddress();
		System.out.println(isLookPack);
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		InetAddressMain IAM = new InetAddressMain();
		IAM.InetSample();

	}

}
