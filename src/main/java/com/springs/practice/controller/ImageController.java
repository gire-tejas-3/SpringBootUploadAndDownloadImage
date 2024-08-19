package com.springs.practice.controller;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.springs.practice.model.Image;
import com.springs.practice.service.ImageService;

@RestController
@RequestMapping("/image")
public class ImageController {

	@Autowired
	private ImageService imageService;

	@PostMapping("/upload")
	public Image uploadImage(@RequestParam MultipartFile multipartFile) throws IOException {
		return imageService.uploadImage(multipartFile);
	}

	@GetMapping("/download")
	public ResponseEntity<Image> downloadImage(@RequestParam Integer id) {
		Image img = imageService.downloadImage(id);
		return new ResponseEntity<Image>(img, HttpStatus.OK);
	}
	

}
