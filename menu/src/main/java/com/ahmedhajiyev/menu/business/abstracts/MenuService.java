package com.ahmedhajiyev.menu.business.abstracts;

import java.util.List;

import com.ahmedhajiyev.menu.business.requests.menu.CreateMenuRequest;
import com.ahmedhajiyev.menu.business.requests.menu.UpdateMenuRequest;
import com.ahmedhajiyev.menu.business.responses.menu.GetAllMenusResponse;
import com.ahmedhajiyev.menu.business.responses.menu.GetByDescriptionMenuResponse;
import com.ahmedhajiyev.menu.business.responses.menu.GetByIdMenuResponse;

public interface MenuService {
	List<GetAllMenusResponse> getAll();
	GetByIdMenuResponse getById(int id);
	GetByDescriptionMenuResponse getByDescrtiption(String description);
	void add(CreateMenuRequest createMenuRequest);
	void update(UpdateMenuRequest updateMenuRequest);
	void delete(int id);
	

}
