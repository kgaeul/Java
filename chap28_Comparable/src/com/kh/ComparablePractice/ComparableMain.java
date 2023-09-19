package com.kh.ComparablePractice;

import java.util.ArrayList;
import java.util.List;

public class ComparableMain {

	public static void main(String[] args) {

		List<CompareExam> Cellebrity = new ArrayList<>();
		
		Cellebrity.add(new CompareExam("송 강","배우",30,"남"));
		Cellebrity.add(new CompareExam("차은우","가수",27,"남"));
		Cellebrity.add(new CompareExam("로 운","가수",28,"남"));
		Cellebrity.add(new CompareExam("이재욱","배우",26,"남"));
		
		//나이를 기준으로 정렬
		
		//Collections.short(people);
		
		for(CompareExam CompareExam : Cellebrity) {
			System.out.println(CompareExam);
		}
		
	}

}
