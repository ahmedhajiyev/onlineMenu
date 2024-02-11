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

@Table(name ="language_categories")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LanguageCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="language_category_id")
	private int lang_category_id;
	
	@ManyToOne
	@JoinColumn(name = "lang_id")
	private Language lang_id;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category_id;
	
	@Column(name="language_category_name")
	private String langCategoryName;
	
	@Column(name="description")
	private String description;

}
