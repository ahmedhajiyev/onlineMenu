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

@Table(name ="language_items")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LanguageItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="language_item_id")
	private int lang_item_id;
	
	@ManyToOne
	@JoinColumn(name="lang_id")
	private Language lang_id;
	
	@ManyToOne
	@JoinColumn(name = "item_id")
	private Item item_id;
	
	@Column(name="item_name")
	private String itemName;
	
	@Column(name="description")
	private String description;

}
