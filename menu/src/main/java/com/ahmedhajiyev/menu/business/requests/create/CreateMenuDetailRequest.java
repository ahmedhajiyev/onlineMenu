package com.ahmedhajiyev.menu.business.requests.create;

import lombok.Data;

@Data
public class CreateMenuDetailRequest {
	
	private int menu_id;
	
	private int lang_id;
	
	private boolean category_visible;
	
	private boolean category_avaible;

}