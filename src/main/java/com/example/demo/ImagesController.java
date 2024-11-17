package com.example.demo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class ImagesController {
	
	@GetMapping("/images")
	public Gallery images(@RequestParam(value = "path", defaultValue = "/book") String path) throws IOException {
		ClassPathResource staticDataResource = new ClassPathResource("images.json");
		String staticDataString = IOUtils.toString(staticDataResource.getInputStream(), StandardCharsets.UTF_8);

		ObjectMapper objectMapper = new ObjectMapper();
		
		return new Gallery(objectMapper.readValue(staticDataString, Images.class), path);
	}
}
