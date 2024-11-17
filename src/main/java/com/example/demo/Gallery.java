package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Gallery {
	private List<Photo> _photos;

	public Gallery(Images images, String path) {
		this._photos = new ArrayList<Photo>();

		for (int i = 0; i < images.folders.length; i++) {
			System.out.println("test");
			if (images.folders[i].path().equals(path)) {
				for (int j = 0; j < images.folders[i].names().length; j++) {
					this._photos.add(new Photo(images.folders[i].names()[j], path));
					System.out.println("test");
				}

			}
		}
	}

	public List<Photo> getPhotos() {
		return this._photos;
	}
}