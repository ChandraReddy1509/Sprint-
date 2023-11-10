package com.onlinepizza.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CascadeType;

import com.onlinepizza.util.PizzaSize;



@Entity
@Table
public class Pizza {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer pizzaId;
	@OneToOne
	private PizzaType pizzaType;
	private String pizzaName;
	private String pizzaDescription;
	// Base Price
	private Double pizzaCost;
	
	@Enumerated(EnumType.STRING)
	private PizzaSize pizzaSize;
	
	@OneToOne
	@JoinColumn(name = "pizzaId")
	private Toppings toppings;
	
	
	public Pizza() {}


	public Pizza(Integer pizzaId, PizzaType pizzaType, String pizzaName, String pizzaDescription, Double pizzaCost,
			PizzaSize pizzaSize, Toppings toppings) {
		super();
		this.pizzaId = pizzaId;
		this.pizzaType = pizzaType;
		this.pizzaName = pizzaName;
		this.pizzaDescription = pizzaDescription;
		this.pizzaCost = pizzaCost;
		this.pizzaSize = pizzaSize;
		this.toppings = toppings;
	}


	public Integer getPizzaId() {
		return pizzaId;
	}


	public void setPizzaId(Integer pizzaId) {
		this.pizzaId = pizzaId;
	}


	public PizzaType getPizzaType() {
		return pizzaType;
	}


	public void setPizzaType(PizzaType pizzaType) {
		this.pizzaType = pizzaType;
	}


	public String getPizzaName() {
		return pizzaName;
	}


	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}


	public String getPizzaDescription() {
		return pizzaDescription;
	}


	public void setPizzaDescription(String pizzaDescription) {
		this.pizzaDescription = pizzaDescription;
	}


	public Double getPizzaCost() {
		return pizzaCost;
	}


	public void setPizzaCost(Double pizzaCost) {
		this.pizzaCost = pizzaCost;
	}


	public PizzaSize getPizzaSize() {
		return pizzaSize;
	}


	public void setPizzaSize(PizzaSize pizzaSize) {
		this.pizzaSize = pizzaSize;
	}


	public Toppings getToppings() {
		return toppings;
	}


	public void setToppings(Toppings toppings) {
		this.toppings = toppings;
	}


	@Override
	public String toString() {
		return "Pizza [pizzaId=" + pizzaId + ", pizzaType=" + pizzaType + ", pizzaName=" + pizzaName
				+ ", pizzaDescription=" + pizzaDescription + ", pizzaCost=" + pizzaCost + ", pizzaSize=" + pizzaSize
				+ ", toppings=" + toppings + "]";
	}

	
	
	

	

	
	
	
	
	

}
