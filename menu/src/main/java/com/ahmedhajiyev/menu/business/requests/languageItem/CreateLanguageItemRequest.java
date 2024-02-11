package com.ahmedhajiyev.menu.business.requests.languageItem;

import com.ahmedhajiyev.menu.entities.concretes.Item;
import com.ahmedhajiyev.menu.entities.concretes.Language;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateLanguageItemRequest {
	@NotNull(message = "Language id may not be null")
	private Language lang_id;
	@NotNull(message = "Item id may not be null")
	private Item item_id;
	@NotNull(message = "Item name may not be null")
	private String item_name;
	@NotNull(message = "Description may not be null")
	private String description;

}
