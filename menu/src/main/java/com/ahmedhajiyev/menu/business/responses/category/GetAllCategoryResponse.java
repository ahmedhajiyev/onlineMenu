package com.ahmedhajiyev.menu.business.responses.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCategoryResponse {
	
	private int category_id;
	
	private String category_name;
	
	private String description;
	
	private boolean visible;
	
	private boolean available;

}
