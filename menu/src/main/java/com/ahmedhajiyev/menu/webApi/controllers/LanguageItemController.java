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

import com.ahmedhajiyev.menu.business.abstracts.LanguageItemService;
import com.ahmedhajiyev.menu.business.requests.languageItem.CreateLanguageItemRequest;
import com.ahmedhajiyev.menu.business.requests.languageItem.UpdateLanguageItemRequest;
import com.ahmedhajiyev.menu.business.responses.languageItem.GetAllLanguageItemResponse;
import com.ahmedhajiyev.menu.business.responses.languageItem.GetByIdLanguageItemResponse;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/languageItem")
@AllArgsConstructor
public class LanguageItemController {
	private LanguageItemService languageItemService;

	@GetMapping
	public List<GetAllLanguageItemResponse> getAll() {
		return languageItemService.getAll();

	}

	@GetMapping("/{id}")
	public GetByIdLanguageItemResponse getById(@PathVariable int lang_item_id) {
		return languageItemService.getById(lang_item_id);
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody CreateLanguageItemRequest createLanguageItemRequest) {
		this.languageItemService.add(createLanguageItemRequest);
	}

	@PutMapping
	public void update(@RequestBody UpdateLanguageItemRequest updateItemRequest) {
		this.languageItemService.update(updateItemRequest);
	}

	@DeleteMapping("/{id}")
	public void delete(int lang_item_id) {
		this.languageItemService.delete(lang_item_id);
	}
}
