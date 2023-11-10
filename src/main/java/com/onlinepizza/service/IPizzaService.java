package com.onlinepizza.service;

import java.util.List; 

import com.onlinepizza.dto.PizzaDTO;
import com.onlinepizza.dto.PizzaTypeDTO;
import com.onlinepizza.dto.ToppingsDTO;
import com.onlinepizza.entity.Pizza;
import com.onlinepizza.entity.PizzaType;
import com.onlinepizza.entity.Toppings;
import com.onlinepizza.exception.PizzaManagementException;


public interface IPizzaService { // all methods implemented
	Pizza addPizza(Pizza pizza);  //done

	Toppings addToppings(Toppings toppings);

	PizzaType addPizzaType(PizzaType pizzaType);

	Pizza updatePizza(Pizza pizza); // done

	Pizza viewPizzaById(Integer pizzaId) throws PizzaManagementException; //done//1

	List<Pizza> viewPizzaByPizzaType(String pizzaType) throws PizzaManagementException; //2

	List<Pizza> viewPizzaByPizzaSize(String pizzaSize)throws  PizzaManagementException; //

	List<Pizza> viewPizzaByPrice(Double minPrice, Double maxPrice); //

	List<Pizza> viewAllPizza(); //done

	List<Toppings> viewToppings();

	Toppings viewToppingByID(Integer toppingsID) throws PizzaManagementException;//3

	PizzaType viewPizzaTypeById(Integer pizzaTypeId);

	List<PizzaType> viewAllPizzaTypes();
}
