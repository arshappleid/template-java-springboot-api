package com.cloudmersive.service;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class getInfo {
	public Map<String, Object> readMe(String username) {
		String message = "Hello " + username + ".";
		return Map.of(
				"status", "succes",
				"message", message,
				"data", Map.of("value", 123, "flag", true));
	}
}
