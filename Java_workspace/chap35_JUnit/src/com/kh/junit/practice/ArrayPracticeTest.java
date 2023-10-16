package com.kh.junit.practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayPracticeTest {
	private ArrayPractice arrp;
	@Test
	public void testPractice1() {
		int[] expected = {1,2,3,4,5,6,7,8,9,10};
		Arra = new arr(10);
		int[] result= arrp.pr1();
		assertEquals(expected,result);
	}
}
