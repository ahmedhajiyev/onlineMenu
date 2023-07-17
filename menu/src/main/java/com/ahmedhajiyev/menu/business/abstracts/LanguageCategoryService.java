package com.ahmedhajiyev.menu.business.abstracts;

import java.util.List;

import com.ahmedhajiyev.menu.business.requests.create.CreateLanguageCategoryRequest;
import com.ahmedhajiyev.menu.business.responses.GetAllLanguageCategoryResponse;

public interface LanguageCategoryService {
	List<GetAllLanguageCategoryResponse> getAll();
	void add(CreateLanguageCategoryRequest createLanguageCategoryRequest);
	
}
