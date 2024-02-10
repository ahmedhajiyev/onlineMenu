package com.ahmedhajiyev.menu.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ahmedhajiyev.menu.business.abstracts.LanguageCategoryService;
import com.ahmedhajiyev.menu.business.requests.languageCategory.CreateLanguageCategoryRequest;
import com.ahmedhajiyev.menu.business.requests.languageCategory.UpdateLanguageCategoryRequest;
import com.ahmedhajiyev.menu.business.responses.languageCategory.GetAllLanguageCategoryResponse;
import com.ahmedhajiyev.menu.business.responses.languageCategory.GetByIdLanguageCategoryResponse;
import com.ahmedhajiyev.menu.core.utilities.mappers.ModelMapperService;
import com.ahmedhajiyev.menu.dataAccess.abstracts.LanguageCategoryRepository;
import com.ahmedhajiyev.menu.entities.concretes.LanguageCategory;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class LanguageCategoryManager implements LanguageCategoryService{
	
	private LanguageCategoryRepository languageCategoryRepository;
	private ModelMapperService modelMapperService;
	
	public List<GetAllLanguageCategoryResponse> getAll() {
		List<LanguageCategory> languageCategories = languageCategoryRepository.findAll();
		
		List<GetAllLanguageCategoryResponse> languageCategoryResponse = languageCategories.stream()
				.map(languageCategory -> this.modelMapperService.forResponse().map(languageCategory, GetAllLanguageCategoryResponse.class))
				.collect(Collectors.toList());
		
		return languageCategoryResponse;
	}
	
	public GetByIdLanguageCategoryResponse getById(int lang_category_id) {
		LanguageCategory languageCategory = this.languageCategoryRepository.findById(lang_category_id).orElseThrow();
		
		GetByIdLanguageCategoryResponse response = this.modelMapperService.forResponse().map(languageCategory, GetByIdLanguageCategoryResponse.class);
		return response;
	}
	
	public void add(CreateLanguageCategoryRequest createLanguageCategoryRequest) {
		LanguageCategory languageCategory = this.modelMapperService.forRequest().map(createLanguageCategoryRequest, LanguageCategory.class);
		this.languageCategoryRepository.save(languageCategory);
	}
	public void update(UpdateLanguageCategoryRequest updateLanguageCategoryRequest) {
		LanguageCategory languageCategory = this.modelMapperService.forRequest().map(updateLanguageCategoryRequest, LanguageCategory.class);
		this.languageCategoryRepository.save(languageCategory);
	}
	
	public void delete(int lang_category_id) {
		this.languageCategoryRepository.deleteById(lang_category_id);
		
	}
	
	

}
