package com.ahmedhajiyev.menu.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahmedhajiyev.menu.entities.concretes.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer>{
	Menu findByDescriptionIgnoreCase(String description);
	boolean existsByDescription(String description);
}
