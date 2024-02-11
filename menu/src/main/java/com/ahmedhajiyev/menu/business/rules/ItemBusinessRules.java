package com.ahmedhajiyev.menu.business.rules;

import org.springframework.stereotype.Service;

import com.ahmedhajiyev.menu.core.utilities.mappers.exceptions.BusinessException;
import com.ahmedhajiyev.menu.dataAccess.abstracts.ItemRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class ItemBusinessRules {
	private ItemRepository itemRepository;
	
	public void checkIfItemNameExists(String itemName) {
		if(this.itemRepository.existsByItemName(itemName)) {
			throw new BusinessException("Item name already exists");
		}
	}

}
