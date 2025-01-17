


package com.ahmedhajiyev.menu.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ahmedhajiyev.menu.business.abstracts.MenuService;
import com.ahmedhajiyev.menu.business.requests.menu.CreateMenuRequest;
import com.ahmedhajiyev.menu.business.requests.menu.UpdateMenuRequest;
import com.ahmedhajiyev.menu.business.responses.menu.GetAllMenusResponse;
import com.ahmedhajiyev.menu.business.responses.menu.GetByDescriptionMenuResponse;
import com.ahmedhajiyev.menu.business.responses.menu.GetByIdMenuResponse;
import com.ahmedhajiyev.menu.business.rules.MenuBusinessRules;
import com.ahmedhajiyev.menu.core.utilities.mappers.ModelMapperService;
import com.ahmedhajiyev.menu.dataAccess.abstracts.MenuRepository;
import com.ahmedhajiyev.menu.entities.concretes.Menu;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class MenuManager implements MenuService {

	private MenuRepository menuRepository;
	private ModelMapperService modelMapperService;
	private MenuBusinessRules menuBusinessRules;

	@Override
	public List<GetAllMenusResponse> getAll() {
		List<Menu> menus = menuRepository.findAll();

		List<GetAllMenusResponse> menusResponse = menus.stream()
				.map(menu -> this.modelMapperService.forResponse().map(menu, GetAllMenusResponse.class))
				.collect(Collectors.toList());

		return menusResponse;
	}

	@Override
	public GetByIdMenuResponse getById(int id) {
		Menu menu = this.menuRepository.findById(id).orElseThrow();

		GetByIdMenuResponse response = this.modelMapperService.forResponse().map(menu, GetByIdMenuResponse.class);

		return response;
	}

	@Override
	public GetByDescriptionMenuResponse getByDescrtiption(String description) {
		Menu menu = this.menuRepository.findByDescriptionIgnoreCase(description);
		GetByDescriptionMenuResponse menuResponse = this.modelMapperService.forResponse().map(menu,
				GetByDescriptionMenuResponse.class);

		return menuResponse;
	}

	@Override
	public void add(CreateMenuRequest createMenuRequest) {
		//to avoid having same item description
		this.menuBusinessRules.checkIfDescriptionExists(createMenuRequest.getDescription());
		Menu menu = this.modelMapperService.forRequest().map(createMenuRequest, Menu.class);
		this.menuRepository.save(menu);
	}

	public void update(UpdateMenuRequest updateMenuRequest) {
		//to avoid having same item description
		this.menuBusinessRules.checkIfDescriptionExists(updateMenuRequest.getDescription());
		
		
		Menu menu = this.modelMapperService.forRequest().map(updateMenuRequest, Menu.class);

		this.menuRepository.save(menu);

	}

	public void delete(int id) {
		this.menuRepository.deleteById(id);
	}

}
