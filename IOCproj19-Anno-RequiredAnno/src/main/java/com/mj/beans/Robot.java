package com.mj.beans;

import org.springframework.beans.factory.annotation.Required;

public class Robot {
	private Integer id;
	private String name;
	private String labName;
	private Double price;
	@Required
	public void setId(Integer id) {
		this.id = id;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
	public void setLabName(String labName) {
		this.labName = labName;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Robot [id=" + id + ", name=" + name + ", labName=" + labName + ", price=" + price + "]";
	}
	
}
