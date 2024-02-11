package com.ahmedhajiyev.menu.business.requests.language;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateLanguageRequest {
	
	@NotNull(message = "Language description may not be nullS")
	private String description;

}
