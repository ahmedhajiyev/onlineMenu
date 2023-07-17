package com.ahmedhajiyev.menu.business.abstracts;

import java.util.List;

import com.ahmedhajiyev.menu.business.requests.create.CreateItemRequest;
import com.ahmedhajiyev.menu.business.responses.GetAllItemResponse;

public interface ItemService {
	List<GetAllItemResponse> getAll();
	void add(CreateItemRequest createItemRequest);
}
