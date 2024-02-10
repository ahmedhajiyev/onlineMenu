package com.ahmedhajiyev.menu.business.responses.menuDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllMenuDetailsResponse {
	
	private int menu_detail_id;
	private int menu_id;
	private int lang_id;
	private boolean category_visible;
	private boolean category_available;

}
