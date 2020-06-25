package com.altimetrik.orderservice.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AddressEntity {
	
	@Id
	private int id;
	private String city;
	private String pincode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public AddressEntity() {
		super();
	}
	
	

}
