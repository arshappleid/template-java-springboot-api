package com.cloudmersive.service;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class movingAverageService {
	public static Map<String, Object> getResp(int[] nums, int windowSize) {
		double[] resp;
		try {
			if (windowSize > nums.length || nums.length == 0) {
				for (int num : nums) {
					System.err.println(num);
				}
				return Map.of(
						"status", "error",
						"message", "Invalid Input");
			}
			resp = calculateMovingAverage(nums, windowSize);
		} catch (Exception e) {
			return Map.of(
					"status", "error",
					"movingAverage", null);
		}

		return Map.of(
				"status", "success",
				"movingAverage", resp);
	}

	public static double[] calculateMovingAverage(int[] nums, int windowSize) {
		int n = nums.length;
		double[] averages = new double[n];

		if (windowSize > n)
			return null;

		try {
			Queue<Integer> que = new LinkedList<>();
			for (int i = 0; i < n; i++) {
				int num = nums[i];
				que.offer(num);
				if (que.size() > windowSize) {
					que.poll();
				}
				double currAverage = calculateAverage(que.toArray(new Integer[0]));
				averages[i] = currAverage;
			}
		} catch (Exception e) {
			System.err.println("Error occured in movingAverageService : " + e.getMessage());
		}
		return averages;
	}

	private static double calculateAverage(Integer[] nums) {
		int n = nums.length;
		double sum = 0;
		for (int num : nums) {
			sum += num;
		}
		return sum / n;
	}

}
