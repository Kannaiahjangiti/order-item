package com.altimetrik.orderitemservice.restcontroller;

import java.awt.event.ItemEvent;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.orderitemservice.entity.Item;
import com.altimetrik.orderitemservice.repository.ItemRepository;

@RestController
@RequestMapping("/item")
public class OrderItemResorce {
	
	@Autowired
	private ItemRepository itemRepository;
	
	@PostMapping("/createItem")
	public Item createItem(@RequestBody Item item) {
		return itemRepository.save(item);
	}

	@GetMapping("/getitem/{id}")
	public Item getItems(@PathVariable(value="id") int id) {
		
		Optional<Item> i =itemRepository.findById(id);
		return i.get();
		
	}
}
