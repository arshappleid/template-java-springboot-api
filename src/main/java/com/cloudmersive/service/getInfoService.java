package com.cloudmersive.service;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class getInfoService {
	public Map<String, Object> readMe(String username) {
		String message = "Hello " + username + ".";
		return Map.of(
				"status", "nvm i am",
				"message", message,
				"data", Map.of("value", 123, "flag", true));
	}

	public static int add(int a, int b) {
		return a + b;
	}
}
