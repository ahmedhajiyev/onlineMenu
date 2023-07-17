package com.ahmedhajiyev.menu.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllItemResponse {
	
	private int item_id;
	
	private String item_name;
	
	private String description;
	
	private double price;
	
	private int category_id;
	
	private int prepare_time;

	private int alcohol;

	private int item_property;

	private String units;

	private int kcal;

	private boolean visible;

	private boolean available;

	private String image_path;

	private String link;

}
