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
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name ="menus")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Menu {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="menu_id")
	private int id;
	
	@Column(name="description")
	private String description;
	
	@OneToMany(mappedBy = "menu_id")
	private List<MenuDetail> menu_details; 

}
