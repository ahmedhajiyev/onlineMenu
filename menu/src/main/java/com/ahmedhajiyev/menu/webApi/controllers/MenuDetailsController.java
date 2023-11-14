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

import com.ahmedhajiyev.menu.business.abstracts.MenuDetailService;
import com.ahmedhajiyev.menu.business.requests.menuDetail.CreateMenuDetailRequest;
import com.ahmedhajiyev.menu.business.requests.menuDetail.UpdateMenuDetailRequest;
import com.ahmedhajiyev.menu.business.responses.GetAllMenuDetailsResponse;
import com.ahmedhajiyev.menu.business.responses.menuDetails.GetByIdMenuDetailsResponse;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/menuDetails")
@AllArgsConstructor
public class MenuDetailsController {
	private MenuDetailService menuDetailService;
	
	@GetMapping
	public List<GetAllMenuDetailsResponse> getAll() {
		return menuDetailService.getAll();
	}
	
	@GetMapping("/{id}")
	public GetByIdMenuDetailsResponse getById(@PathVariable int menu_details_id) {
		return menuDetailService.getById(menu_details_id);
	}
	
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody CreateMenuDetailRequest createMenuDetailRequest) {
		this.menuDetailService.add(createMenuDetailRequest);
		
	}
	
	@PutMapping
	public void update(@RequestBody UpdateMenuDetailRequest updateMenuDetailRequest) {
		this.menuDetailService.update(updateMenuDetailRequest);
	}
	
	@DeleteMapping("/{id}")
	public void delete(int id) {
		this.menuDetailService.delete(id);
	}
	
}
