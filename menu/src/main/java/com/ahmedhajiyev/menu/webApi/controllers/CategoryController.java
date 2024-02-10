package com.ahmedhajiyev.menu.webApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ahmedhajiyev.menu.business.abstracts.CategoryService;
import com.ahmedhajiyev.menu.business.requests.category.CreateCategoryRequest;
import com.ahmedhajiyev.menu.business.requests.category.UpdateCategoryRequest;
import com.ahmedhajiyev.menu.business.responses.category.GetAllCategoryResponse;
import com.ahmedhajiyev.menu.business.responses.category.GetByIdCategoryResponse;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoryController {
	private CategoryService categoryService;
	
	@GetMapping
	public List<GetAllCategoryResponse> getAll(){
		return categoryService.getAll();
	}
	
	@GetMapping("/{id}")
	public GetByIdCategoryResponse getById(@PathVariable int category_id) {
		return categoryService.getById(category_id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody CreateCategoryRequest createCategoryRequest) {
		this.categoryService.add(createCategoryRequest);
	}
	
	@PutMapping
	public void update(@RequestBody UpdateCategoryRequest updateCategoryRequest) {
		this.categoryService.update(updateCategoryRequest);
	}
	
	@DeleteMapping("/{id}")
	public void delete(int category_id) {
		this.categoryService.delete(category_id);
	}
	
}
