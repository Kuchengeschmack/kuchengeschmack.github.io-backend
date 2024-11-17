package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Gallery {
	private List<Photo> _photos;

	public Gallery(Images images, String path) {
		this._photos = new ArrayList<Photo>();

		for (int i = 0; i < images.getFolders().length; i++) {
			if (images.getFolders()[i].getPath().equals(path)) {
				for (int j = 0; j < images.getFolders()[i].getFileNames().length; j++) {
					this._photos.add(new Photo(images.getFolders()[i].getFileNames()[j], path));
				}

			}
		}
	}

	public List<Photo> getPhotos() {
		return this._photos;
	}
}