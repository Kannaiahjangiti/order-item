package com.altimetrik.orderservice.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.orderservice.domain.Item;
import com.altimetrik.orderservice.domain.OrderEntity;
import com.altimetrik.orderservice.domain.OrderNotFoud;
import com.altimetrik.orderservice.repository.AddressRepository;
import com.altimetrik.orderservice.repository.OrderRepository;

@RestController
@RequestMapping("/order")
public class OrderResorce {
	
	@Autowired
	private OrderRepository  orderRepository;
	
	@Autowired
	private AddressRepository  addressRepository;
	
	@Autowired
	private OrderItemServiceCall orderItemServiceCall;
	
	@PostMapping(value="/createOrder")
	public void createOrder(@RequestBody OrderEntity entity) {
		
		if(entity==null || entity.getAddress()==null || entity.getCname()==null || entity.getItemid()==null || entity.getOrderDate()==null) {
			throw new OrderNotFoud("Order Not found");
		}
		orderRepository.save(entity);
		orderItemServiceCall.createItem(entity);
		
	}
	@GetMapping(value="/createOrder")
	public Item getOrder(@PathVariable("id") int id) {
		if(id==0) {
			throw new OrderNotFoud("Order Not found from serached ");
		}
		Item i = orderItemServiceCall.getItems(id);
		return i;
		
	}


}
