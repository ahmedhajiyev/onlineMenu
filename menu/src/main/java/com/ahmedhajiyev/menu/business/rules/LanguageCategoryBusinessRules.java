package com.ahmedhajiyev.menu.business.rules;

import org.springframework.stereotype.Service;

import com.ahmedhajiyev.menu.core.utilities.mappers.exceptions.BusinessException;
import com.ahmedhajiyev.menu.dataAccess.abstracts.LanguageCategoryRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LanguageCategoryBusinessRules {
	private LanguageCategoryRepository languageCategoryRepository;
	
	public void checkIfLanguagaCategoryName(String langCategoryName) {
		if(this.languageCategoryRepository.existsByLangCategoryName(langCategoryName)) {
			throw new BusinessException("Languaga category name already exists");
		}
	}

}
