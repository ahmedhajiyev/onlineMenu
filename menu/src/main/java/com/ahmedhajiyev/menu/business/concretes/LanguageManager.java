package com.ahmedhajiyev.menu.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ahmedhajiyev.menu.business.abstracts.LanguageService;
import com.ahmedhajiyev.menu.business.requests.language.CreateLanguageRequest;
import com.ahmedhajiyev.menu.business.requests.language.UpdateLanguageRequest;
import com.ahmedhajiyev.menu.business.responses.language.GetAllLanguageResponse;
import com.ahmedhajiyev.menu.business.responses.language.GetByDescriptionLanguageResponse;
import com.ahmedhajiyev.menu.business.responses.language.GetByIdLanguageResponse;
import com.ahmedhajiyev.menu.business.rules.LanguageBusinessRules;
import com.ahmedhajiyev.menu.core.utilities.mappers.ModelMapperService;
import com.ahmedhajiyev.menu.dataAccess.abstracts.LanguageRepository;
import com.ahmedhajiyev.menu.entities.concretes.Language;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;
	private ModelMapperService modelMapperService;
	private LanguageBusinessRules languageBusinessRules;

	@Override
	public List<GetAllLanguageResponse> getAll() {
		List<Language> languages = languageRepository.findAll();

		List<GetAllLanguageResponse> languagesResponse = languages.stream()
				.map(language -> this.modelMapperService.forResponse().map(language, GetAllLanguageResponse.class))
				.collect(Collectors.toList());
		return languagesResponse;
	}

	@Override
	public GetByIdLanguageResponse getById(int lang_id) {
		Language language = this.languageRepository.findById(lang_id).orElseThrow();

		GetByIdLanguageResponse response = this.modelMapperService.forResponse().map(language,
				GetByIdLanguageResponse.class);
		return response;
	}

	@Override
	public GetByDescriptionLanguageResponse getByDescription(String description) {
		Language language = this.languageRepository.findByDescriptionIgnoreCase(description);
		GetByDescriptionLanguageResponse response = this.modelMapperService.forResponse()
				.map(language, GetByDescriptionLanguageResponse.class);
		
		return response;
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) {
		this.languageBusinessRules.checkIfDescriptionExists(createLanguageRequest.getDescription());
		Language language = this.modelMapperService.forRequest().map(createLanguageRequest, Language.class);
		this.languageRepository.save(language);
	}

	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest) {
		this.languageBusinessRules.checkIfDescriptionExists(updateLanguageRequest.getDescription());
		Language language = this.modelMapperService.forRequest().map(updateLanguageRequest, Language.class);
		this.languageRepository.save(language);
	}

	@Override
	public void delete(int lang_id) {
		this.languageRepository.deleteById(lang_id);
	}

}
