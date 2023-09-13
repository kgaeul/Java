package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/* 
 
 Date :  날짜와 시간정보를 나타내는 데 사용
 자바 1 이후 권장되지 않음
 java.time 패키지 LocalDate LocalTime LocalDateTime
  */
	
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println("현재 날짜 :"+currentDate);
		
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("현재 날짜와 시간 :"+currentDateTime);
		
		LocalTime currentTime = LocalTime.now();
		 
		System.out.println("현재 시간 :"+currentTime);
		
		
		
		for(int i=0;i<8;i++) {
			System.out.println(currentTime);
		}
		
		LocalDate today = LocalDate.now();
		LocalDate future1 = today.plusDays(5);
		LocalDate future2 = today.plusYears(1);
		LocalDate future3 = future2.plusDays(103);
		
		LocalDate past1 = today.minusYears(5);
		LocalDate past2 = today.minusDays(1);
		
		System.out.println("[5일 뒤 날짜] :"+future1);
		System.out.println("[1년 뒤 날짜] :"+future2);
		System.out.println("[1년 뒤 크리스마스] :"+future3);
		
		System.out.println("[5년 전 날짜] :"+past1);
		System.out.println("[1일 전 날짜] :"+past2);
		
		LocalDate date1 = LocalDate.of(2021,3,19);
		LocalDate date2 = LocalDate.of(2021,3,20);
	
		boolean isBefore =true;
		if(date1.isBefore(date2)) {
			System.out.println(date1+"는"+date2+"의 이전 날짜입니다. ");
		}else if(date2.isAfter(date2)) {
			System.out.println(date1+"의 이후 날짜입니다. ");
		}else {
			System.out.println(date1);
			
		}
		System.out.println(true);
	
	}

}
