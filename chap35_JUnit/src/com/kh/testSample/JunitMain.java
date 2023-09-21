package com.kh.testSample;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitMain {

	@Test
	public void testStringEquals() {
		String expected = "Hello, World";
		String actual = "Hello, World";
		assertEquals(expected,actual);
	}
	
	@Test
	public void testStringInEqual() {
		String expected = "Hellow, Java!";
		String actual = "Hellow, World";
		assertNotEquals(expected,actual);
	}
	
	@Test
	public void testArrayEquals() {
		int[] expected= {1,2,3};
		int[] actual= {1,2,3};
		assertArrayEquals(expected,actual);
	}
	@Test
	public void testArrayInEquals() {
		int[] expected= {1,2,3};
		int[] actual= {4,5,6};
		assertArrayEquals(expected,actual);
	}
	
	@Test
	public void testDoubleEquals() {
		double expected= 0.1+0.2;
		double actual= 0.3;
		assertEquals(expected,actual,0.001);// 부동 소수점 비교 (오차 범위 지정)
	}
	@Test
	public void testDoubleInEquals() {
		double expected= 0.1+0.2;
		double actual= 0.31;
		assertNotEquals(expected,actual,0.001);
	}
}
