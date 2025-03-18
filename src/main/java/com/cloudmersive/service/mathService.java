package com.cloudmersive.service;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class mathService {
	public static Map<String, Object> addValues(int[] nums) {
		int sum = 0;
		try {
			for (int num : nums)
				sum += num;
		} catch (Exception e) {
			return Map.of(
					"status", "error",
					"sum", 0);
		}

		return Map.of(
				"status", "success",
				"sum", sum);
	}

}
