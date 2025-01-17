
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

import com.ahmedhajiyev.menu.business.abstracts.MenuService;
import com.ahmedhajiyev.menu.business.requests.menu.CreateMenuRequest;
import com.ahmedhajiyev.menu.business.requests.menu.UpdateMenuRequest;
import com.ahmedhajiyev.menu.business.responses.menu.GetAllMenusResponse;
import com.ahmedhajiyev.menu.business.responses.menu.GetByDescriptionMenuResponse;
import com.ahmedhajiyev.menu.business.responses.menu.GetByIdMenuResponse;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/menus")
@AllArgsConstructor
public class MenuController {
	private MenuService menuService;
	
	@GetMapping
	public List<GetAllMenusResponse> getAll() {
		return menuService.getAll();
	}
	
	@GetMapping("/{id}")
	public GetByIdMenuResponse getById(@PathVariable int id) {
		return menuService.getById(id);
	}
	
	@GetMapping("/{description}")
	public GetByDescriptionMenuResponse getByDescription(@PathVariable String description) {
		return menuService.getByDescrtiption(description);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody CreateMenuRequest createMenuRequest) {
		this.menuService.add(createMenuRequest);
		
	}
	
	@PutMapping
	public void update(@RequestBody UpdateMenuRequest updateMenuRequest) {
		this.menuService.update(updateMenuRequest);
	}
	
	@DeleteMapping("/{id}")
	public void delete(int id) {
		this.menuService.delete(id);
	}
	

}
