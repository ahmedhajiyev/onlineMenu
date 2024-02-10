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

import com.ahmedhajiyev.menu.business.abstracts.LanguageCategoryService;
import com.ahmedhajiyev.menu.business.requests.languageCategory.CreateLanguageCategoryRequest;
import com.ahmedhajiyev.menu.business.requests.languageCategory.UpdateLanguageCategoryRequest;
import com.ahmedhajiyev.menu.business.responses.languageCategory.GetAllLanguageCategoryResponse;
import com.ahmedhajiyev.menu.business.responses.languageCategory.GetByIdLanguageCategoryResponse;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/languageCategories")
@AllArgsConstructor
public class LanguageCategoryController {
	private LanguageCategoryService languageCategoryService;

	@GetMapping
	public List<GetAllLanguageCategoryResponse> getAll() {
		return languageCategoryService.getAll();
	}

	@GetMapping("/{id}")
	public GetByIdLanguageCategoryResponse getById(@PathVariable int lang_category_id) {
		return languageCategoryService.getById(lang_category_id);
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody CreateLanguageCategoryRequest createLanguageCategoryRequest) {
		this.languageCategoryService.add(createLanguageCategoryRequest);
	}

	@PutMapping
	public void update(@RequestBody UpdateLanguageCategoryRequest updateLanguageCategoryRequest) {
		this.languageCategoryService.update(updateLanguageCategoryRequest);
	}

	@DeleteMapping("/{id}")
	public void delete(int lang_category_id) {
		this.languageCategoryService.delete(lang_category_id);
	}
}
