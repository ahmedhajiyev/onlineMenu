package com.ahmedhajiyev.menu.business.requests.language;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateLanguageRequest {
	@NotNull(message = "Language Id may not be null")
	private int lang_id;
	@NotNull(message = "Description may not be null")
	private String description;
	
	

}
