package com.ahmedhajiyev.menu.business.abstracts;

import java.util.List;

import com.ahmedhajiyev.menu.business.requests.create.CreateLanguageItemRequest;
import com.ahmedhajiyev.menu.business.responses.GetAllLanguageItemResponse;

public interface LanguageItemService {
	List<GetAllLanguageItemResponse> getAll();
	void add(CreateLanguageItemRequest createLanguageItemRequest);
}
