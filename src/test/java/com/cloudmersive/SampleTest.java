package com.cloudmersive;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

public class SampleTest {

	// Initiate an instance of the app
	@Autowired
	App app;

	@Test
	public void testAddition() {
		int actual = 7;
		int expected = 7;

		assertEquals(actual, expected, "Test Did not pass");
	}

	@Test
	public void testArrayEquals() {
		int[] actual = { 1, 2, 3 };
		int[] expected = { 1, 2, 3 };

		assertArrayEquals(expected, actual);
	}

}
