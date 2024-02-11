package com.ahmedhajiyev.menu.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ahmedhajiyev.menu.business.abstracts.LanguageItemService;
import com.ahmedhajiyev.menu.business.requests.languageItem.CreateLanguageItemRequest;
import com.ahmedhajiyev.menu.business.requests.languageItem.UpdateLanguageItemRequest;
import com.ahmedhajiyev.menu.business.responses.languageItem.GetAllLanguageItemResponse;
import com.ahmedhajiyev.menu.business.responses.languageItem.GetByIdLanguageItemResponse;
import com.ahmedhajiyev.menu.business.rules.LanguageItemBusinessRules;
import com.ahmedhajiyev.menu.core.utilities.mappers.ModelMapperService;
import com.ahmedhajiyev.menu.dataAccess.abstracts.LanguageItemRepository;
import com.ahmedhajiyev.menu.entities.concretes.LanguageItem;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LanguageItemManager implements LanguageItemService {

	private LanguageItemRepository languageItemRepository;
	private ModelMapperService modelMapperService;
	private LanguageItemBusinessRules languageItemBusinessRules;

	@Override
	public List<GetAllLanguageItemResponse> getAll() {
		List<LanguageItem> languageItems = languageItemRepository.findAll();

		List<GetAllLanguageItemResponse> response = languageItems.stream().map(languageItem -> this.modelMapperService
				.forResponse().map(languageItem, GetAllLanguageItemResponse.class)).collect(Collectors.toList());
		return response;
	}

	@Override
	public GetByIdLanguageItemResponse getById(int lang_item_id) {
		LanguageItem languageItem = languageItemRepository.findById(lang_item_id).orElseThrow();
		GetByIdLanguageItemResponse response = this.modelMapperService
				.forResponse().map(languageItem, GetByIdLanguageItemResponse.class);
 		return response;
	}

	@Override
	public void add(CreateLanguageItemRequest createLanguageItemRequest) {
		//this.languageItemBusinessRules.checkIfDescriptionExists(createLanguageItemRequest.getDescription());
		//to avoid having same item name
		this.languageItemBusinessRules.checkIfLanguageItemNameExists(createLanguageItemRequest.getItem_name());

		LanguageItem languageItem = this.modelMapperService.forRequest()
				.map(createLanguageItemRequest, LanguageItem.class);
		this.languageItemRepository.save(languageItem);
	}

	@Override
	public void update(UpdateLanguageItemRequest updateLanguageItemRequest) {
		//this.languageItemBusinessRules.checkIfDescriptionExists(updateLanguageItemRequest.getDescription());
		//to avoid having same item name
		this.languageItemBusinessRules.checkIfLanguageItemNameExists(updateLanguageItemRequest.getItem_name());	
		LanguageItem languageItem = this.modelMapperService.forRequest().map(updateLanguageItemRequest, LanguageItem.class);
		this.languageItemRepository.save(languageItem);
	}

	@Override
	public void delete(int lang_item_id) {
		this.languageItemRepository.deleteById(lang_item_id);
		
	}

}
