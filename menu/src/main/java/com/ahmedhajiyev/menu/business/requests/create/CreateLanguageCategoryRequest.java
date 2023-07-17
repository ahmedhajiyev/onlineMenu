package com.ahmedhajiyev.menu.business.requests.create;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateLanguageCategoryRequest {
	
	private int lang_id;
	
	private int category_id;
	
	private String lang_category_name;
	
	private String description;

}