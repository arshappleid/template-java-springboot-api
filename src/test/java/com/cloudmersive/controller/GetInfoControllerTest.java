package com.cloudmersive.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Map;

import static org.mockito.Mockito.when;

@WebMvcTest(ApiController.class)
public class GetInfoControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private ApiController apiController;

	@Test
	public void testGetInfoGet() throws Exception {
		// Expected Behaviour
		// When I call this method on this controller, return this.
		when(apiController.getInfo()).thenReturn(Map.of("message", "unknown user"));;

		// Actual
		mockMvc.perform(get("/api/getInfo")) // Ensure this matches the actual mapping in your controller
				.andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.message").value("unknown user"));
	}

	@Test
	public void testGetInfoPost() throws Exception {
		// Create a request map
		Map<String, String> request = Map.of("username", "test");

		// Convert Map to JSON string
		String jsonRequest = new ObjectMapper().writeValueAsString(request);

		// Expected Behaviour
		// Adjust mock behavior if this method is involved in processing the POST
		// request

		// Perform the POST request with the request body
		mockMvc.perform(post("/api/getInfo")
				.contentType(MediaType.APPLICATION_JSON)
				.content(jsonRequest))
				.andExpect(status().isOk());
				
	}
}
