package com.ahmedhajiyev.menu.business.requests.menu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateMenuRequest {
	private int id;
	private String description;

}
