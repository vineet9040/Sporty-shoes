package com.example.major.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.major.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
