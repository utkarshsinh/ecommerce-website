package com.educative.ecommerce.service;

import com.educative.ecommerce.model.Category;
import com.educative.ecommerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryrepository;

	public Category readCategory(String categoryName) {
		return categoryrepository.findByCategoryName(categoryName);
	}

	public void createCategory(Category category) {
		categoryrepository.save(category);
	}

	public List<Category> listCategories() {
		return categoryrepository.findAll();
	}
	public Optional<Category> readCategory(Integer categoryId) {
		return categoryrepository.findById(categoryId);
	}

	public void updateCategory(Integer categoryID, Category newCategory) {
		Category category = categoryrepository.findById(categoryID).get();
		category.setCategoryName(newCategory.getCategoryName());
		category.setDescription(newCategory.getDescription());
		category.setImageUrl(newCategory.getImageUrl());
		categoryrepository.save(category);
	}



}
