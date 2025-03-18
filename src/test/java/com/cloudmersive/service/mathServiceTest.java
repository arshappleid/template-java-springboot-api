package com.cloudmersive.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import com.cloudmersive.App;

public class mathServiceTest {
	@Autowired
	App app;

	@Test
	public void testAddValues_ValidInput1() {

		int[] nums = { 1, 2, 3, 4, 5 };
		int expected = 15;

		Map<String, Object> resp = mathService.addValues(nums);
		int actual = (int) resp.get("sum");
		assertEquals(expected, actual, "Test Did not pass");
	}

	@Test
	public void testAddValues_ValidInput2() {

		int[] nums = { 1 };
		int expected = 1;

		int actual = (int) mathService.addValues(nums).get("sum");
		// assertArrayEquals(expected, actual, "Test Did not pass");
		// assertNotEquals(expected, actual, "Test Did not pass");
		assertEquals(expected, actual, "Test Did not pass");
	}

	@Test
	public void testAddValues_inValidInput() {

		int[] nums = {};
		String expectedStatus = "error";
		String actual = (String) mathService.addValues(nums).get("message");
		assertEquals(expectedStatus, actual, "Test Did not pass");
	}

	@Test
	public void testAddValues_emptyInput() {

		int[] nums = {};
		String expectedStatus = "error";
		String actual = (String) mathService.addValues(nums).get("message");
		assertEquals(expectedStatus, actual, "Test Did not pass");
	}

}
