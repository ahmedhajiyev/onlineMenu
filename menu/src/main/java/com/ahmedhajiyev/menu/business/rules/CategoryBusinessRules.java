package com.ahmedhajiyev.menu.business.rules;

import org.springframework.stereotype.Service;

import com.ahmedhajiyev.menu.core.utilities.mappers.exceptions.BusinessException;
import com.ahmedhajiyev.menu.dataAccess.abstracts.CategoryRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategoryBusinessRules{
	private CategoryRepository categoryRepository;
	
	//to avoid having same category names
	public void checkIfCategoryNameExists(String categoryName) {
		if(this.categoryRepository.existsByCategoryName(categoryName)) {
			throw new BusinessException("Category already exists");
		}
		
	}

}
