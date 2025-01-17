package com.ahmedhajiyev.menu.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahmedhajiyev.menu.entities.concretes.LanguageItem;

public interface LanguageItemRepository extends JpaRepository<LanguageItem, Integer> {

	boolean existsByDescription(String description);

	boolean existsByItemName(String item_name);

}
