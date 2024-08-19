package com.springs.practice.service.Implementation;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.springs.practice.model.Image;
import com.springs.practice.repository.ImageRepository;
import com.springs.practice.service.ImageService;

@Service
public class ImageServiceImplementation implements ImageService {

	@Autowired
	private ImageRepository imageRepository;

	@Override
	public Image uploadImage(MultipartFile multipartFile) throws IOException {
		String fileName = multipartFile.getOriginalFilename();
		String fileContentType = multipartFile.getContentType();
		long fileSize = multipartFile.getSize();
		byte[] file = multipartFile.getBytes();

		return imageRepository.save(new Image(fileName, fileContentType, fileSize, file));
	}

	@Override
	public Image downloadImage(Integer id) {
		return imageRepository.findById(id);
	}

}
