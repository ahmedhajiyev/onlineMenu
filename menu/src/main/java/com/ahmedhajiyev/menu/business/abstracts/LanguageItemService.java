package com.ahmedhajiyev.menu.business.abstracts;

import java.util.List;

import com.ahmedhajiyev.menu.business.requests.languageItem.CreateLanguageItemRequest;
import com.ahmedhajiyev.menu.business.requests.languageItem.UpdateLanguageItemRequest;
import com.ahmedhajiyev.menu.business.responses.languageItem.GetAllLanguageItemResponse;
import com.ahmedhajiyev.menu.business.responses.languageItem.GetByIdLanguageItemResponse;

public interface LanguageItemService {
	List<GetAllLanguageItemResponse> getAll();
	GetByIdLanguageItemResponse getById(int lang_item_id);
	void add(CreateLanguageItemRequest createLanguageItemRequest);
	void update(UpdateLanguageItemRequest updateLanguageItemRequest);
	void delete(int lang_item_id);
}
