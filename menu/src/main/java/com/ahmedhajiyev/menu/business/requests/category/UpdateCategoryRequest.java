package com.ahmedhajiyev.menu.business.requests.category;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCategoryRequest {
	@NotNull(message = "Id may not be null")
	private int category_id;
	@NotBlank(message = "Category name may not be blank")
	private String categoryName;
	@NotBlank(message = "Description may not be blank")
	private String description;
	private boolean visible;

}
