package com.ahmedhajiyev.menu.business.abstracts;

import java.util.List;

import com.ahmedhajiyev.menu.business.requests.create.CreateCategoryRequest;
import com.ahmedhajiyev.menu.business.responses.GetAllCategoryResponse;

public interface CategoryService {

	List<GetAllCategoryResponse> getAll();
	void add(CreateCategoryRequest createCategoryRequest);
}
