package com.springs.practice.model;

import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "image")
public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fileName;
	private String fileContentType;
	private Long fileSize;
	
	@Lob
	private byte[] file;
	
	public Image() {
		
	}

	public Image(String fileName, String fileContentType, Long fileSize, byte[] file) {
		this.fileName = fileName;
		this.fileContentType = fileContentType;
		this.fileSize = fileSize;
		this.file = file;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	public Long getFileSize() {
		return fileSize;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return "Image [id=" + id + ", fileName=" + fileName + ", fileContentType=" + fileContentType + ", fileSize="
				+ fileSize + ", file=" + Arrays.toString(file) + "]";
	}

}
