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

import com.ahmedhajiyev.menu.business.abstracts.LanguageService;
import com.ahmedhajiyev.menu.business.requests.language.CreateLanguageRequest;
import com.ahmedhajiyev.menu.business.requests.language.UpdateLanguageRequest;
import com.ahmedhajiyev.menu.business.responses.language.GetAllLanguageResponse;
import com.ahmedhajiyev.menu.business.responses.language.GetByDescriptionLanguageResponse;
import com.ahmedhajiyev.menu.business.responses.language.GetByIdLanguageResponse;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/languages")
@AllArgsConstructor
public class LanguageController {
	private LanguageService languageService;
	
	@GetMapping
	public List<GetAllLanguageResponse> getAll() {
		return languageService.getAll();
		
	}
	
	@GetMapping("/{id}")
	public GetByIdLanguageResponse getById(@PathVariable int lang_id) {
		return languageService.getById(lang_id);
	}
	
	@GetMapping("/{description}")
	public GetByDescriptionLanguageResponse getByDescription(@PathVariable String lang_description) {
		return languageService.getByDescription(lang_description);
	}
	
	@PostMapping
	@ResponseStatus(code=HttpStatus.CREATED)
	public void add(@RequestBody CreateLanguageRequest createLanguageRequest) {
		this.languageService.add(createLanguageRequest);
	}
	
	@PutMapping
	public void update(@RequestBody UpdateLanguageRequest updateLanguageRequest) {
		this.languageService.update(updateLanguageRequest);
	}
	
	@DeleteMapping
	public void delete(int lang_id) {
		this.languageService.delete(lang_id);
	}

}
