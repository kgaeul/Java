package com.kh.api.exam1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain {

	public static void main(String[] args) {

		//클래스를 사용한 현재 날짜와 시간 가져오기
		
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DATE);
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		System.out.print("캘린더를 이용한 현재 날짜와 시간");
		System.out.print(year+"년 ");
		System.out.print(month+"월 ");
		System.out.print(day+"일 ");
		System.out.print(hour+"시 ");
		System.out.print(minute+"분 ");
		System.out.print(second+"초");
		
		GregorianCalendar gCalendar = new GregorianCalendar();
		year = gCalendar.get(Calendar.YEAR);
		month = gCalendar.get(Calendar.MONTH);
		day = gCalendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+month+day);
		
		
		
		
		
		
		
		
	}

}
