package com.example.demo;

public class Images {
	private Folder[] folders;

	Images() {
		super();
	}

	Images(Folder[] folders) {
		this.folders = folders;
	}

	public Folder[] getFolders() {
		return this.folders;
	}
}
