package com.ahmedhajiyev.menu.business.responses.menu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdMenuResponse {
	private int id;
	private String description;

}
