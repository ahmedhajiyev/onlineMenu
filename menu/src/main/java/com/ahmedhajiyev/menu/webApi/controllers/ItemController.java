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

import com.ahmedhajiyev.menu.business.abstracts.ItemService;
import com.ahmedhajiyev.menu.business.requests.item.CreateItemRequest;
import com.ahmedhajiyev.menu.business.requests.item.UpdateItemRequest;
import com.ahmedhajiyev.menu.business.responses.item.GetAllItemResponse;
import com.ahmedhajiyev.menu.business.responses.item.GetByIdItemResponse;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/items")
@AllArgsConstructor
public class ItemController {
	private ItemService itemService;

	@GetMapping
	public List<GetAllItemResponse> getAll() {
		return itemService.getAll();

	}

	@GetMapping("/{id}")
	public GetByIdItemResponse getByIdItemResponse(@PathVariable int id) {
		return itemService.getById(id);

	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody CreateItemRequest createItemRequest) {
		this.itemService.add(createItemRequest);

	}

	@PutMapping
	public void update(@RequestBody UpdateItemRequest itemRequest) {
		this.itemService.update(itemRequest);
	}

	@DeleteMapping("/{id}")
	public void delete(int id) {
		this.itemService.delete(id);
	}

}
