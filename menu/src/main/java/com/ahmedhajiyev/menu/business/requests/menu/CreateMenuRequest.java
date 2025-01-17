package com.ahmedhajiyev.menu.business.requests.menu;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateMenuRequest {
	@NotNull
	@Size(min=3, max=20)
	private String description;
}
