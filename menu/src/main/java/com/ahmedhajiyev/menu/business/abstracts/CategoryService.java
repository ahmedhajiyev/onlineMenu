package com.ahmedhajiyev.menu.business.abstracts;

import java.util.List;

import com.ahmedhajiyev.menu.business.requests.category.CreateCategoryRequest;
import com.ahmedhajiyev.menu.business.requests.category.UpdateCategoryRequest;
import com.ahmedhajiyev.menu.business.responses.category.GetAllCategoryResponse;
import com.ahmedhajiyev.menu.business.responses.category.GetByIdCategoryResponse;

public interface CategoryService {

	List<GetAllCategoryResponse> getAll();
	GetByIdCategoryResponse getById(int category_id);
	void add(CreateCategoryRequest createCategoryRequest);
	void update(UpdateCategoryRequest updateCategoryRequest);
	void delete(int category_id);
}
