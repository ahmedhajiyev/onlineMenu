package com.ahmedhajiyev.menu.business.abstracts;

import java.util.List;

import com.ahmedhajiyev.menu.business.requests.menuDetail.CreateMenuDetailRequest;
import com.ahmedhajiyev.menu.business.requests.menuDetail.UpdateMenuDetailRequest;
import com.ahmedhajiyev.menu.business.responses.GetAllMenuDetailsResponse;
import com.ahmedhajiyev.menu.business.responses.menuDetails.GetByIdMenuDetailsResponse;

public interface MenuDetailService {
	List<GetAllMenuDetailsResponse> getAll();
	GetByIdMenuDetailsResponse getById(int menu_details_id);
	void add(CreateMenuDetailRequest createMenuDetailRequest); 
	void update(UpdateMenuDetailRequest updateMenuDetailRequest);
	void delete(int menu_details_id);
}
