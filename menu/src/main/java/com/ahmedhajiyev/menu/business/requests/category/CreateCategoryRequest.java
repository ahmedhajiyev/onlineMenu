package com.ahmedhajiyev.menu.business.requests.category;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCategoryRequest {
	@NotBlank(message = "Category name may not be blank")
	private String categoryName;
	@NotBlank(message = "Description may not be blank")
	private String description;
	private boolean visible;
}
