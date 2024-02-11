package com.ahmedhajiyev.menu.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "items")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "item_id")
	private int item_id;

	@Column(name = "item_name")
	private String itemName;

	@Column(name = "description")
	private String description;

	@Column(name = "price")
	private double price;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category_id;

	@Column(name = "prepare_time")
	private int prepare_time;

	@Column(name = "alcohol")
	private int alcohol;

	@Column(name = "item_property")
	private int item_property;

	@Column(name = "units")
	private String units;

	@Column(name = "kcal")
	private int kcal;

	@Column(name = "visible")
	private boolean visible;

	@Column(name = "available")
	private boolean available;

	@Column(name = "image_path")
	private String image_path;

	@Column(name = "link")
	private String link;

	@OneToMany(mappedBy = "item_id")
	private List<LanguageItem> lang_items;

}
