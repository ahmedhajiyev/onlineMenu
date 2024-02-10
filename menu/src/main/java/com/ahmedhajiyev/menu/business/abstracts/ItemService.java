package com.ahmedhajiyev.menu.business.abstracts;

import java.util.List;

import com.ahmedhajiyev.menu.business.requests.item.CreateItemRequest;
import com.ahmedhajiyev.menu.business.requests.item.UpdateItemRequest;
import com.ahmedhajiyev.menu.business.responses.item.GetAllItemResponse;
import com.ahmedhajiyev.menu.business.responses.item.GetByIdItemResponse;

public interface ItemService {
	List<GetAllItemResponse> getAll();
	GetByIdItemResponse getById(int item_id);
	void add(CreateItemRequest createItemRequest);
	void update(UpdateItemRequest updateItemRequest);
	void delete(int item_id);
}


