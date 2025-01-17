package com.ahmedhajiyev.menu.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name ="languages")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Language {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="language_id")
	private int lang_id;
	
	@Column(name="description")
	private String description;
	
	@OneToMany(mappedBy = "lang_id")
	private List<MenuDetail> menu_details;
	
	@OneToMany(mappedBy = "lang_id")
	private List<LanguageItem> lang_items;
	
	@OneToMany(mappedBy = "lang_id")
	private List<LanguageCategory> lang_categories;
	
	

}
