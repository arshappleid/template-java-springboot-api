package com.cloudmersive.dto;

import com.fasterxml.jackson.annotation.*;

public class movingAverageInput {

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@JsonProperty(required = false)
	private String message;

	@JsonProperty(required = true)
	private int windowSize;

	@JsonProperty(required = true)
	private int[] dataArr;

	// Getters and Setters

	public int[] getData() {
		return this.dataArr;
	}

	public int getWindowSize() {
		return this.windowSize;
	}

	public String getMessage() {
		if (this.message != null)
			return this.message;

		return "";
	}

}
