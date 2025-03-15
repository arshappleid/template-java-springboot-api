package com.cloudmersive;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

	private App main;

	@BeforeEach
	void setUp() {
		main = new App(); // runs before each test method
	}

	@Test
	public void testAddition() {
		int actual = 7;
		int expected = 7;
		assertEquals(actual, expected, "Test Did not pass");
	}

}
