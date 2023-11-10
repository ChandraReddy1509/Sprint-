package com.onlinepizza.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class PizzaType {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer pizzaTypeId;
	// Veg or Non-Veg
	private String pizzaType;
	@OneToMany
	private List<Toppings> toppings;
	
	
	
	public PizzaType() {}

	public PizzaType(Integer pizzaTypeId, String pizzaType, List<Toppings> toppings) {
		super();
		this.pizzaTypeId = pizzaTypeId;
		this.pizzaType = pizzaType;
		this.toppings = toppings;
	}

	public Integer getPizzaTypeId() {
		return pizzaTypeId;
	}

	public void setPizzaTypeId(Integer pizzaTypeId) {
		this.pizzaTypeId = pizzaTypeId;
	}

	public String getPizzaType() {
		return pizzaType;
	}

	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}

	public List<Toppings> getToppings() {
		return toppings;
	}

	public void setToppings(List<Toppings> toppings) {
		this.toppings = toppings;
	}

	@Override
	public String toString() {
		return "PizzaType [pizzaTypeId=" + pizzaTypeId + ", pizzaType=" + pizzaType + ", toppings=" + toppings + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(pizzaType, pizzaTypeId, toppings);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PizzaType other = (PizzaType) obj;
		return Objects.equals(pizzaType, other.pizzaType) && Objects.equals(pizzaTypeId, other.pizzaTypeId)
				&& Objects.equals(toppings, other.toppings);
	}
	
}
