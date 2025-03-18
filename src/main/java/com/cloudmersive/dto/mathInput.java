package com.cloudmersive.dto;

import com.fasterxml.jackson.annotation.*;

public class mathInput {

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@JsonProperty(required = false)
	private String message;

	@JsonProperty(required = true)
	private int num;

	@JsonProperty(required = true)
	private int[] dataArr;

	// Getters and Setters

	public int[] getData() {
		return this.dataArr;
	}

	public int getNum() {
		return this.num;
	}

	public String getMessage() {
		if (this.message != null)
			return this.message;

		return "";
	}

}
