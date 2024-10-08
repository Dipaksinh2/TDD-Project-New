package com.tdd.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

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

	@Test
	public void testCustomDelimiter() {
		assertEquals(6, calculateString.add("//;\n1;2;3"));
	}

	@Test
	public void testNegativeNumbers() {
		try {
			calculateString.add("1,-2,3,-4");
			fail("Exception not thrown");
		} catch (IllegalArgumentException e) {
			assertEquals("negative numbers not allowed -2,-4", e.getMessage());
		}
	}
}
