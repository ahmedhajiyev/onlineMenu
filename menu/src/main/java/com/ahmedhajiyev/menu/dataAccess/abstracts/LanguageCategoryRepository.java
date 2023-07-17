package com.ahmedhajiyev.menu.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahmedhajiyev.menu.entities.concretes.LanguageCategory;

public interface LanguageCategoryRepository extends JpaRepository<LanguageCategory, Integer>{

}
