package com.kh.Comparable;

import java.util.ArrayList;
import java.util.List;

public class ComparMain {

	public static void main(String[] args) {

		List<Person> people = new ArrayList<>();
		
		people.add(new Person("김가나",78));
		people.add(new Person("김다라",40));
		people.add(new Person("김마바",28));
		people.add(new Person("김사아",71));
		
		//나이를 기준으로 정렬
		
		//Collections.short(people);
		
		for(Person person : people) {
			System.out.println(person);
		}
		
	}

}
