package com.ahmedhajiyev.menu.business.responses.language;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByDescriptionLanguageResponse {
	private int lang_id;
	private String description;
	
}