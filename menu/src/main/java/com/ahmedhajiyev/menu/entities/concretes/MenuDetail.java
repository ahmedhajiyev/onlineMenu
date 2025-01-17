package com.ahmedhajiyev.menu.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name ="menu_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MenuDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="menu_details_id")
	private int menu_details_id;
	
	@ManyToOne
	@JoinColumn(name="menu_id")
	private Menu menu_id;
	
	@ManyToOne
	@JoinColumn(name="lang_id")
	private Language lang_id;
	
	//category_lang_id
	
	//lang_item_id
	
//	@Column(name="price")
//	private double price;
	
	@Column(name="category_visible")
	private boolean category_visible;
	
	@Column(name="category_available")
	private boolean category_available;
	
	//item visible
	
	//item available
	
	
	
}
