package com.springs.practice.service;

import java.io.IOException;
import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

import com.springs.practice.model.Image;

public interface ImageService {

	public Image uploadImage(MultipartFile multipartFile) throws IOException;

	public Image downloadImage(Integer id);
}
