package com.ahmedhajiyev.menu.business.responses.languageCategory;

import com.ahmedhajiyev.menu.entities.concretes.Category;
import com.ahmedhajiyev.menu.entities.concretes.Language;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdLanguageCategoryResponse {
	private int lang_category_id;
	private Language lang_id;
	private Category category_id;
	private String lang_category_name;
	private String description;

}
