package com.cloudmersive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

import com.cloudmersive.dto.getInfoInput;
import com.cloudmersive.service.getInfo;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	private getInfo getInfoService;

	@PostMapping("/getInfo")
	public Map<String, Object> transform(@RequestBody getInfoInput input) {
		String username = input.getUsername();
		return getInfoService.readMe(username);
	}

	@GetMapping("/getInfo")
	public Map<String, Object> getInfo(@RequestBody getInfoInput input) {
		return getInfoService.readMe("unknown user");
	}
}