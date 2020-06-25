package com.altimetrik.orderservice.restcontroller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.altimetrik.orderservice.domain.Item;


@FeignClient(name="IteamOrder")
public interface OrderItemServiceCall {
	
	@PostMapping("/createItem")
	public Item createItem(@RequestBody Item item) ;

	@GetMapping("/getitem/{id}")
	public Item getItems(@PathVariable(value="id") int id) ;
		

}
