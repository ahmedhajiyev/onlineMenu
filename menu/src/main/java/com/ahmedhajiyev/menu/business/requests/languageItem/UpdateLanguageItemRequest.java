package com.ahmedhajiyev.menu.business.requests.languageItem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateLanguageItemRequest {
	private int lang_item_id;
	private int lang_id;
	private int item_id;
	private String item_name;
	private String description;
	
}