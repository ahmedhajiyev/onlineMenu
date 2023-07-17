package com.ahmedhajiyev.menu.business.abstracts;

import java.util.List;

import com.ahmedhajiyev.menu.business.requests.create.CreateMenuRequest;
import com.ahmedhajiyev.menu.business.responses.GetAllMenusResponse;

public interface MenuService {
	List<GetAllMenusResponse> getAll();
	void add(CreateMenuRequest createMenuRequest);

}
