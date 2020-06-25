package com.altimetrik.orderservice.domain;

public class OrderNotFoud extends RuntimeException{
	
	private String name;

	public OrderNotFoud(String name) {
		super();
		this.name = name;
	}
	
	
	

}
