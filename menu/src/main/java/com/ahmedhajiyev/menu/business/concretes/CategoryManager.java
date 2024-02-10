package com.ahmedhajiyev.menu.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ahmedhajiyev.menu.business.abstracts.CategoryService;
import com.ahmedhajiyev.menu.business.requests.category.CreateCategoryRequest;
import com.ahmedhajiyev.menu.business.requests.category.UpdateCategoryRequest;
import com.ahmedhajiyev.menu.business.responses.category.GetAllCategoryResponse;
import com.ahmedhajiyev.menu.business.responses.category.GetByIdCategoryResponse;
import com.ahmedhajiyev.menu.core.utilities.mappers.ModelMapperService;
import com.ahmedhajiyev.menu.dataAccess.abstracts.CategoryRepository;
import com.ahmedhajiyev.menu.entities.concretes.Category;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CategoryManager implements CategoryService {

	private CategoryRepository categoryRepository;
	private ModelMapperService modelMapperService;

	@Override
	public List<GetAllCategoryResponse> getAll() {
		List<Category> categories = categoryRepository.findAll();

		List<GetAllCategoryResponse> categoryResponse = categories.stream()
				.map(category -> this.modelMapperService.forResponse().map(category, GetAllCategoryResponse.class))
				.collect(Collectors.toList());
		return categoryResponse;
	}

	@Override
	public GetByIdCategoryResponse getById(int category_id) {
		Category category = this.categoryRepository.findById(category_id).orElseThrow();

		GetByIdCategoryResponse response = this.modelMapperService.forResponse().map(category,
				GetByIdCategoryResponse.class);
		return response;
	}

	@Override
	public void add(CreateCategoryRequest createCategoryRequest) {
		Category category = this.modelMapperService.forRequest().map(createCategoryRequest, Category.class);
		this.categoryRepository.save(category);
	}

	@Override
	public void update(UpdateCategoryRequest updateCategoryRequest) {
		Category category = this.modelMapperService.forRequest().map(updateCategoryRequest, Category.class);
		this.categoryRepository.save(category);
	}

	@Override
	public void delete(int category_id) {
		this.categoryRepository.deleteById(category_id);
	}

}
