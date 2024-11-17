package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImagesController {

	String[] book = { "51degre", "agave", "Bandoleo", "Bellisla", "Blonde", "bronzage", "buick", "Cadillac", "clairde",
			"Contrejo", "crescent", "Diane", "Ethermer", "Femme", "Fenetre", "fordmust", "Frenchri", "helios",
			"Heuresch", "jaguar", "Lamain", "Lavoute", "Matin", "Meditati", "meilleur", "reminisc", "Rolls", "Songeuse",
			"themeant", "Timine", "Visage" };
	String[] intro = { "la-montagne-des-pyrenees" };
	Folder[] folders = { new Folder("/book", book), new Folder("/intro", intro) };
	Images images = new Images(folders);

	@GetMapping("/images")
	public Gallery images(@RequestParam(value = "path", defaultValue = "/book") String path) {

		return new Gallery(images, path);
	}
}
