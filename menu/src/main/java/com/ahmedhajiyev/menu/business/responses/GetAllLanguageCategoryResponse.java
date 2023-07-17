package com.ahmedhajiyev.menu.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllLanguageCategoryResponse {
	
	private int lang_category_id;
	
	private int lang_id;
	
	private int category_id;
	
	private String lang_category_name;
	
	private String description;

}
