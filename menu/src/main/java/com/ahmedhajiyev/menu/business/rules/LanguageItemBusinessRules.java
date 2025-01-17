package com.ahmedhajiyev.menu.business.rules;

import org.springframework.stereotype.Service;

import com.ahmedhajiyev.menu.core.utilities.mappers.exceptions.BusinessException;
import com.ahmedhajiyev.menu.dataAccess.abstracts.LanguageItemRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LanguageItemBusinessRules implements CommonService {
	private LanguageItemRepository languageItemRepository;

	@Override
	public void checkIfDescriptionExists(String description) {
		if (this.languageItemRepository.existsByDescription(description)) {
			throw new BusinessException("Language Item description already exists");
		}
	}

	public void checkIfLanguageItemNameExists(String item_name) {
		if (this.languageItemRepository.existsByItemName(item_name)) {
			throw new BusinessException("Language Item name already exists");
		}
	}

}
