package com.ahmedhajiyev.menu.business.abstracts;

import java.util.List;

import com.ahmedhajiyev.menu.business.requests.menuDetail.CreateMenuDetailRequest;
import com.ahmedhajiyev.menu.business.responses.GetAllMenuDetailsResponse;

public interface MenuDetailService {
	List<GetAllMenuDetailsResponse> getAll();
	void add(CreateMenuDetailRequest createMenuDetailRequest); 
}
