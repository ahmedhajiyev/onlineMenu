package com.ahmedhajiyev.menu.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahmedhajiyev.menu.entities.concretes.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	//for questioning whether category name exists or not
	boolean existsByCategoryName(String categoryName);
}
