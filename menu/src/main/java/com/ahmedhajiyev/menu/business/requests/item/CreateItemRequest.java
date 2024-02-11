package com.ahmedhajiyev.menu.business.requests.item;

import com.ahmedhajiyev.menu.entities.concretes.Category;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateItemRequest {
	@NotNull(message = "Item name may not be null")
	private String itemName;
	@NotNull(message = "Item description may not be null")
	private String description;
	@NotNull(message = "Item price may not be null")
	private double price;
	@NotNull(message = "Category_Id may not be null")
	private Category category_id;
	private int prepare_time;
	@NotNull(message = "Alchocol may not be null")
	private int alchocol;
	private int item_property;
	@NotNull(message = "Units may not be null")
	private String units;
	@NotNull(message = "Kcal may not be null")
	private int kcal;
	private boolean visible;
	private boolean available;
	private String image_path;
	private String link;
	
}
