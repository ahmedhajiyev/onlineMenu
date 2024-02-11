package com.ahmedhajiyev.menu.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahmedhajiyev.menu.entities.concretes.Language;

public interface LanguageRepository extends JpaRepository<Language, Integer> {
	Language findByDescriptionIgnoreCase(String description);

	//for questioning whether description exists or not
	boolean existsByDescription(String description);
}
