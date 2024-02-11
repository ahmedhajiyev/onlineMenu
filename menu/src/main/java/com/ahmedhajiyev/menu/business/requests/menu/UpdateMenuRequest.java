package com.ahmedhajiyev.menu.business.requests.menu;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateMenuRequest {
	@NotNull(message = "Id may not be null")
	private int id;
	@NotNull(message = "Description may not be null")
	private String description;

}
