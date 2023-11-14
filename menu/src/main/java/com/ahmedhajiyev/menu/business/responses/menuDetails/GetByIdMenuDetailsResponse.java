package com.ahmedhajiyev.menu.business.responses.menuDetails;

import com.ahmedhajiyev.menu.entities.concretes.Language;
import com.ahmedhajiyev.menu.entities.concretes.Menu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdMenuDetailsResponse {
	private int menu_details_id;
	private Menu menu_id;
	private Language lang_id;
	private boolean category_visible;
	private boolean category_available;
	

}
