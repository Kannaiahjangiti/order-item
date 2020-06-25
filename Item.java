package com.altimetrik.orderservice.domain;

public class Item {


	private int id;
	private String productCode;
	private String produtName;
	private int quantity;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the productCode
	 */
	public String getProductCode() {
		return productCode;
	}
	/**
	 * @param productCode the productCode to set
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	/**
	 * @return the produtName
	 */
	public String getProdutName() {
		return produtName;
	}
	/**
	 * @param produtName the produtName to set
	 */
	public void setProdutName(String produtName) {
		this.produtName = produtName;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Item() {
		super();
	}
	
	
}
