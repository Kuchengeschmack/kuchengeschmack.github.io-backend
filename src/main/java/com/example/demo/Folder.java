package com.example.demo;

public class Folder {
	private String path;
	private String[] fileNames;

	Folder() {
		super();
	}

	Folder(String path, String[] names) {
		this.path = path;
		this.fileNames = names;
	}

	public String getPath() {
		return this.path;
	}

	public String[] getFileNames() {
		return this.fileNames;
	}
}