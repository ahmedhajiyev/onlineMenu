package com.ahmedhajiyev.menu.business.requests.menuDetail;

import com.ahmedhajiyev.menu.entities.concretes.Language;
import com.ahmedhajiyev.menu.entities.concretes.Menu;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateMenuDetailRequest {
	@NotNull(message = "Menu id may not be null")
	private Menu menu_id;
	@NotNull(message = "Language id may not be null")
	private Language lang_id;
	private boolean category_visible;
	private boolean category_available;
	

}
