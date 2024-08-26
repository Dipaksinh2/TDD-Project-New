package com.tdd.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.tdd.string.Controller.MyController;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest()
class StringApplicationTests {
	MyController myController;

	@BeforeEach
	void setUp(){
		myController=new MyController();
	}

	@Test
	public void testEmptyString() {
		assertEquals(0, myController.add(""));
	}

	@Test
	public void testSingleNumber() {
		assertEquals(1, myController.add("1"));
	}
}
