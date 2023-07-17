package com.ahmedhajiyev.menu.business.abstracts;

import java.util.List;

import com.ahmedhajiyev.menu.business.requests.create.CreateLanguageRequest;
import com.ahmedhajiyev.menu.business.responses.GetAllLanguageResponse;

public interface LanguageService {

	List<GetAllLanguageResponse> getAll();
	void add(CreateLanguageRequest createLanguageRequest);
}
