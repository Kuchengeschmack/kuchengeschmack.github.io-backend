package com.example.demo;

public class Photo {
	private String alt;
	private String src;

	Photo(String alt, String src) {
		this.alt = alt;
		this.src = "assets/images" + src + '/' + alt;
	}

	public String getAlt() {
		return this.alt;
	}

	public String getSrc() {
		return this.src;
	}
}