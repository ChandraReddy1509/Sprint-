package com.onlinepizza.service;

import java.time.LocalDate;
import java.util.List;

import com.onlinepizza.dto.PizzaOrderDTO;
import com.onlinepizza.entity.PizzaOrder;

public interface IPizzaOrderService {
	
	
	PizzaOrder bookPizzaOrder(PizzaOrder order);

	PizzaOrder updatepizzaOrder(PizzaOrder pizzaOrder);

	String cancelPizzaOrder(Integer pizzaId);

	PizzaOrder viewPizzaOrderById(Integer pizzaOrderId);
	
	List<PizzaOrder> viewAllPizzaOrders();
	
	List<PizzaOrder> viewPizzaOrderByStartAndEndDate(LocalDate startDate, LocalDate endDate);

	List<PizzaOrder> viewPizzaOrderByDate(LocalDate date);
	
	List<PizzaOrder> viewPizzaOrderByCustomerId(Integer customerId);
	
	List<PizzaOrder> viewPizzaOrderByStatus(String status);
	
	List<PizzaOrder> viewPizzaOrderByCustomerIdAndStatus(Integer customerId, String status);

}
