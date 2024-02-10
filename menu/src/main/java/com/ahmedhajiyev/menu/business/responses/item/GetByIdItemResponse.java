package com.ahmedhajiyev.menu.business.responses.item;

import com.ahmedhajiyev.menu.entities.concretes.Category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdItemResponse {
	private int item_id;
	private int item_name;
	private String description;
	private double price;
	private Category category_id;
	private int prepare_time;
	private int alchocol;
	private int item_property;
	private String units;
	private int kcal;
	private boolean visible;
	private boolean available;
	private String image_path;
	private String link;

}
