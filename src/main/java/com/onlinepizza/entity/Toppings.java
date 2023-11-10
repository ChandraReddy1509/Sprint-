package com.onlinepizza.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Toppings {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer toppingsId;
	private String toppingsName;
	private Double price;
	
	@OneToOne(mappedBy = "toppings")
	private Pizza pizza;
	
	public Toppings() {}

	public Toppings(Integer toppingsId, String toppingsName, Double price) {
		super();
		this.toppingsId = toppingsId;
		this.toppingsName = toppingsName;
		this.price = price;
	}

	public Integer getToppingsId() {
		return toppingsId;
	}

	public void setToppingsId(Integer toppingsId) {
		this.toppingsId = toppingsId;
	}

	public String getToppingsName() {
		return toppingsName;
	}

	public void setToppingsName(String toppingsName) {
		this.toppingsName = toppingsName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
