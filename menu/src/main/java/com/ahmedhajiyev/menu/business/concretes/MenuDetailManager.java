package com.ahmedhajiyev.menu.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ahmedhajiyev.menu.business.abstracts.MenuDetailService;
import com.ahmedhajiyev.menu.business.requests.menuDetail.CreateMenuDetailRequest;
import com.ahmedhajiyev.menu.business.requests.menuDetail.UpdateMenuDetailRequest;
import com.ahmedhajiyev.menu.business.responses.GetAllMenuDetailsResponse;
import com.ahmedhajiyev.menu.business.responses.menuDetails.GetByIdMenuDetailsResponse;
import com.ahmedhajiyev.menu.core.utilities.mappers.ModelMapperService;
import com.ahmedhajiyev.menu.dataAccess.abstracts.MenuDetailRepository;
import com.ahmedhajiyev.menu.entities.concretes.MenuDetail;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MenuDetailManager implements MenuDetailService {
	private MenuDetailRepository menuDetailRepository;
	private ModelMapperService modelMapperService;

	@Override
	public List<GetAllMenuDetailsResponse> getAll() {
		List<MenuDetail> menuDetails = this.menuDetailRepository.findAll();

		List<GetAllMenuDetailsResponse> response = menuDetails.stream().map(
				menuDetail -> this.modelMapperService.forResponse().map(menuDetail, GetAllMenuDetailsResponse.class))
				.collect(Collectors.toList());
		return response;
	}

	@Override
	public GetByIdMenuDetailsResponse getById(int menu_details_id) {
		MenuDetail menuDetail = this.menuDetailRepository.findById(menu_details_id).orElseThrow();

		GetByIdMenuDetailsResponse response = this.modelMapperService.forResponse().map(menuDetail,
				GetByIdMenuDetailsResponse.class);
		return response;
	}

	@Override
	public void add(CreateMenuDetailRequest createMenuDetailRequest) {
		MenuDetail menuDetail = this.modelMapperService.forRequest().map(createMenuDetailRequest, MenuDetail.class);
		this.menuDetailRepository.save(menuDetail);
	}

	@Override
	public void update(UpdateMenuDetailRequest updateMenuDetailRequest) {
		MenuDetail menuDetail = this.modelMapperService.forRequest().map(updateMenuDetailRequest, MenuDetail.class);
		this.menuDetailRepository.save(menuDetail);
	}

	@Override
	public void delete(int menu_details_id) {
		this.menuDetailRepository.deleteById(menu_details_id);
	}

}
