package com.ahmedhajiyev.menu.business.rules;

import org.springframework.stereotype.Service;

import com.ahmedhajiyev.menu.core.utilities.mappers.exceptions.BusinessException;
import com.ahmedhajiyev.menu.dataAccess.abstracts.MenuRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MenuBusinessRules implements CommonService {
	private MenuRepository menuRepository;

	public void checkIfDescriptionExists(String description) {
		if (this.menuRepository.existsByDescription(description)) {
			throw new BusinessException("Menu description already exists");
		}
	}



}