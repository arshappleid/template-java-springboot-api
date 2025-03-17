package com.cloudmersive.service;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.cloudmersive.App;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class getInfoTest {
	@Autowired
	App app;

	@Test
	public void testAddition() {
		int actual = 7;
		int expected = getInfoService.add(5, 2);
		assertEquals(actual, expected, "Test Did not pass");
	}

}
