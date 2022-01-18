package com.sasken.trg;


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.sasken.trg.Utility;



public class UtilityTest {
	
	Utility utl;
	 
	@BeforeEach
	public void CreateObject() {
		utl=new Utility();
	}
	
	@BeforeAll
	public static void testsStarted() {
		System.out.println("tests started");
	}
	
	
	@Test
	public void addTest() {
		
		int result=utl.add(23,34);
		assertEquals(57,result,"add method wrong");
		
	}

	@Test
	public void subTest() {
		
		int result=utl.subtract(23,34);
		
		assertEquals(-11,result,"subtract method wrong");
		
	}
	
	@Test
	public void sumFourNumbers() {
		int x[]= {10,20,30,40};
		
		int sum=utl.sumArray(x);
		assertEquals(100, sum);
	}
	
	
	@Test
	public void sumSixNumbers() {
		int x[]= {10,20,30,40,50,60};
		
		int sum=utl.sumArray(x);
		assertEquals(210, sum);
		
	}
	
	@Test
	
	public void checkNumberTest() {
		
		assertThrows(ArithmeticException.class,()-> { utl.checkNumber(100);});
	}
	
	@Test
	public void checkNumberTest2() {
		try {
			utl.checkNumber(100);
			fail("checkNumber not throwing exception");
		}
		catch(ArithmeticException ex) {
		}
	}
	

	@ParameterizedTest
	@ValueSource(ints = {131,12121,252,1})
	public void palindromeTest(int x) {
		
		assertTrue(utl.checkPalindrome(x));
		
	}
	
	public static int[][] dataForAdd() {
		return new int[][] {{10,20,30},{1,2,3},{5,7,12}};
		
	}
	
	@ParameterizedTest
	@MethodSource("dataForAdd")
	public void testMultiAdd(int x[]) {
		int result=utl.add(x[0],x[1]);
		assertEquals(x[2],result);
		
	}
}