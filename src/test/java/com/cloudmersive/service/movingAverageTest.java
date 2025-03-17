package com.cloudmersive.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.cloudmersive.App;

public class movingAverageTest {
	@Autowired
	App app;

	@Test
	public void testCalculateMovingAverage_ValidInput1() {

		int[] nums = { 1, 2, 3, 4, 5 };
		int windowSize = 3;
		double[] expected = { 1.0, 1.5, 2.0, 3.0, 4.0 };

		double[] actual = movingAverageService.calculateMovingAverage(nums, windowSize);
		assertArrayEquals(expected, actual, "Test Did not pass");
	}

	@Test
	public void testCalculateMovingAverage_ValidInput2() {

		int[] nums = { 1 };
		int windowSize = 1;
		double[] expected = { 1.0 };

		double[] actual = movingAverageService.calculateMovingAverage(nums, windowSize);
		assertArrayEquals(expected, actual, "Test Did not pass");
	}

	@Test
	public void testCalculateMovingAverage_InValidInput() {

		int[] nums = { 1, 2, 3, 4, 5 };
		int windowSize = 6;
		double[] expected = null;

		double[] actual = movingAverageService.calculateMovingAverage(nums, windowSize);
		assertArrayEquals(expected, actual, "Test Did not pass");
	}

	@Test
	public void testCalculateMovingAverage_EmptyInput() {

		int[] nums = new int[0];
		int windowSize = 6;
		double[] expected = null;

		double[] actual = movingAverageService.calculateMovingAverage(nums, windowSize);
		assertArrayEquals(expected, actual, "Test Did not pass");
	}

}
