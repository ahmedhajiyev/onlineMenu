package com.ahmedhajiyev.menu.business.requests.languageCategory;

import com.ahmedhajiyev.menu.business.requests.language.CreateLanguageRequest;
import com.ahmedhajiyev.menu.entities.concretes.Category;
import com.ahmedhajiyev.menu.entities.concretes.Language;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateLanguageCategoryRequest {
	@NotNull(message = "Laguage category Id may not be null")
	private int language_category_id;
	@NotNull(message = "Language Id may not be null")
	private Language lang_id;
	@NotNull(message = "Category Id may not be null")
	private Category category_id;
	@NotNull(message = "Language category name may not be null")
	private String langCategoryName;
	@NotNull(message = "Description  may not be null")
	private String description;

}
