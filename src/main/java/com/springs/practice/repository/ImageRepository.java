package com.springs.practice.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springs.practice.model.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Serializable> {

	public Image findById(Integer id);
}
