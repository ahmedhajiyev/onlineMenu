package com.ahmedhajiyev.menu.business.requests.create;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCategoryRequest {
	
	private String category_name;
	
	private String description;
	
	private boolean visible;
	
	private boolean available;

}
