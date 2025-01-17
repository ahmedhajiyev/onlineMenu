package com.ahmedhajiyev.menu.business.abstracts;

import java.util.List;

import com.ahmedhajiyev.menu.business.requests.language.CreateLanguageRequest;
import com.ahmedhajiyev.menu.business.requests.language.UpdateLanguageRequest;
import com.ahmedhajiyev.menu.business.responses.language.GetAllLanguageResponse;
import com.ahmedhajiyev.menu.business.responses.language.GetByDescriptionLanguageResponse;
import com.ahmedhajiyev.menu.business.responses.language.GetByIdLanguageResponse;

public interface LanguageService {

	List<GetAllLanguageResponse> getAll();
	GetByIdLanguageResponse getById(int lang_id);
	GetByDescriptionLanguageResponse getByDescription(String description);
	
	void add(CreateLanguageRequest createLanguageRequest);
	void update(UpdateLanguageRequest updateLanguageRequest);
	void delete(int lang_id);
}
