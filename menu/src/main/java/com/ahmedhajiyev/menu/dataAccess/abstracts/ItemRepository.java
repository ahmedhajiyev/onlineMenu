package com.ahmedhajiyev.menu.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahmedhajiyev.menu.entities.concretes.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{
	//for questioning whether item name exists or not
	boolean existsByItemName(String itemName);

}
