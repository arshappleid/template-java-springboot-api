package com.cloudmersive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

import com.cloudmersive.dto.mathInput;
import com.cloudmersive.service.mathService;

import java.util.Map;

@RestController
@RequestMapping("/math")
public class ApiController {

	@Autowired
	private mathService math;

	@PostMapping("/addValues")
	public Map<String, Object> addValues(@RequestBody mathInput input) {
		int[] nums = input.getData();
		if (nums == null || nums.length == 0) {
			return Map.of(
					"message", "Invalid Input");
		}
		return mathService.addValues(nums);
	}

	@GetMapping("/getInfo")
	public Map<String, Object> getInfo() {
		return Map.of(
				"message", "Hello World");
	}

}