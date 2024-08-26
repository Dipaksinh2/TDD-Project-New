package com.tdd.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

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

}
