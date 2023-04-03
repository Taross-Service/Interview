package com.taross.interview.util.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.taross.interview.util.ArrayMathUtils;

public class ArrayMathUtilsTest {

	@BeforeAll
	public static void startup() {}

	@BeforeEach
	public void setup() {}

	@Test
	public void testFindMax() {
		// test method
		int[] intArr = {0, 1, 2, 3, 4, 5};
		assertEquals(5, ArrayMathUtils.findMax(intArr));

		intArr = new int[] {1029, 4029, 444, 3291, 92, 11, 0};
		assertEquals(4029, ArrayMathUtils.findMax(intArr));
		
//		String[] stringArr = new String[] {"abc", "abb", "acb", "def", "cgf"};
//		assertEquals("def", ArrayMathUtils.findMax(stringArr));
	}
	
	@AfterEach
	public void tearDown() {}

	@AfterAll
	public static void shutdown() {}
}
