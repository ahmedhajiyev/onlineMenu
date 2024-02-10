package com.ahmedhajiyev.menu.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ahmedhajiyev.menu.business.abstracts.ItemService;
import com.ahmedhajiyev.menu.business.requests.item.CreateItemRequest;
import com.ahmedhajiyev.menu.business.requests.item.UpdateItemRequest;
import com.ahmedhajiyev.menu.business.responses.item.GetAllItemResponse;
import com.ahmedhajiyev.menu.business.responses.item.GetByIdItemResponse;
import com.ahmedhajiyev.menu.core.utilities.mappers.ModelMapperService;
import com.ahmedhajiyev.menu.dataAccess.abstracts.ItemRepository;
import com.ahmedhajiyev.menu.entities.concretes.Item;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ItemManager implements ItemService {

	private ItemRepository itemRepository;
	private ModelMapperService modelMapperService;

	@Override
	public List<GetAllItemResponse> getAll() {
		List<Item> items = itemRepository.findAll();
		List<GetAllItemResponse> itemResponse = items.stream()
				.map(item->this.modelMapperService.forResponse()
						.map(item, GetAllItemResponse.class))
				.collect(Collectors.toList());
	return itemResponse;
	}

	@Override
	public GetByIdItemResponse getById(int item_id) {
		Item item = itemRepository.findById(item_id).orElseThrow();
		GetByIdItemResponse response = this.modelMapperService.forResponse()
				.map(item, GetByIdItemResponse.class);
		return response;
	}

	@Override
	public void add(CreateItemRequest createItemRequest) {
		Item item = this.modelMapperService.forRequest()
				.map(createItemRequest, Item.class);
		this.itemRepository.save(item);
	}

	@Override
	public void update(UpdateItemRequest updateItemRequest) {
		Item item = this.modelMapperService.forRequest()
				.map(updateItemRequest, Item.class);
		this.itemRepository.save(item);
	}

	@Override
	public void delete(int item_id) {
		this.itemRepository.deleteById(item_id);
	}

}
