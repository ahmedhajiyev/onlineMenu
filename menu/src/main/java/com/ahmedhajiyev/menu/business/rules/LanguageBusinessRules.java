package com.ahmedhajiyev.menu.business.rules;

import org.springframework.stereotype.Service;

import com.ahmedhajiyev.menu.core.utilities.mappers.exceptions.BusinessException;
import com.ahmedhajiyev.menu.dataAccess.abstracts.LanguageRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LanguageBusinessRules implements CommonService{
	private LanguageRepository languageRepository;

	@Override
	public void checkIfDescriptionExists(String description) {
		if (this.languageRepository.existsByDescription(description) ) {
			throw new BusinessException("Language description already exists");
		}
		
	}

}
