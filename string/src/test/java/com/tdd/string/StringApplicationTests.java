package com.tdd.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest()
class StringApplicationTests {
	CalculateString calculateString;

	@BeforeEach
	void setUp(){
		calculateString=new CalculateString();
	}

	@Test
	public void testEmptyString() {
		assertEquals(0, calculateString.add(""));
	}

	@Test
	public void testSingleNumber() {
		assertEquals(1, calculateString.add("1"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(6, calculateString.add("1,5"));
	}

	@Test
	public void testNewLines() {
		assertEquals(6, calculateString.add("1\n2,3"));
	}
}
