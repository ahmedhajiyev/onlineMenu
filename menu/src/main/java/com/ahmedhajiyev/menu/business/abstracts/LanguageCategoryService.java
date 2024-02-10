package com.ahmedhajiyev.menu.business.abstracts;

import java.util.List;

import com.ahmedhajiyev.menu.business.requests.languageCategory.CreateLanguageCategoryRequest;
import com.ahmedhajiyev.menu.business.requests.languageCategory.UpdateLanguageCategoryRequest;
import com.ahmedhajiyev.menu.business.responses.languageCategory.GetAllLanguageCategoryResponse;
import com.ahmedhajiyev.menu.business.responses.languageCategory.GetByIdLanguageCategoryResponse;

public interface LanguageCategoryService {
	List<GetAllLanguageCategoryResponse> getAll();
	GetByIdLanguageCategoryResponse getById(int lang_category_id);
	void add(CreateLanguageCategoryRequest createLanguageCategoryRequest);
	void update(UpdateLanguageCategoryRequest updateLanguageCategoryRequest);
	void delete(int lang_category_id);
	
}
