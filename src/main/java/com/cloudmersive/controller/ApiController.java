package com.cloudmersive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

import com.cloudmersive.dto.getInfoInput;
import com.cloudmersive.dto.movingAverageInput;
import com.cloudmersive.service.getInfoService;
import com.cloudmersive.service.movingAverageService;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	private getInfoService getInfoService;

	@PostMapping("/getInfo")
	public Map<String, Object> transform(@RequestBody getInfoInput input) {
		String username = input.getUsername();
		return getInfoService.readMe(username);
	}

	@GetMapping("/getInfo")
	public Map<String, Object> getInfo() {
		return getInfoService.readMe("unknown user");
	}

	@PostMapping("/calculateMovingAverage")
	public Map<String, Object> getInfo(@RequestBody movingAverageInput input) {
		int[] nums = input.getData();
		int windowSize = input.getWindowSize();
		return movingAverageService.getResp(nums, windowSize);
	}

}