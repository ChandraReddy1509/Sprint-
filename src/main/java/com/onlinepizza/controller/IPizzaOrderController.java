package com.onlinepizza.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinepizza.entity.PizzaOrder;
import com.onlinepizza.service.IPizzaOrderService;

@RestController
@RequestMapping("/pizzaorder")
public class IPizzaOrderController {
	
	@Autowired
	IPizzaOrderService ipizzaorderservice;
	
	@PostMapping("/porder")
	public PizzaOrder bookPizzaOrder(PizzaOrder order) {
		
		return ipizzaorderservice.bookPizzaOrder(order);
		
	}
	
	@PutMapping("/pizzaupdate")
	public PizzaOrder updatepizzaOrder(@RequestBody PizzaOrder pizzaOrder) {
		return ipizzaorderservice.updatepizzaOrder(pizzaOrder);
		
	}
	
	@DeleteMapping("/pizzacancel")
	public String cancelPizzaOrder(Integer pizzaId) {
		
		return ipizzaorderservice.cancelPizzaOrder(pizzaId);
		
	}
	
	@GetMapping("/pbyid/{pizzaOrderId}")
	public PizzaOrder viewPizzaOrderById(@PathVariable ("pizzaOrderId") Integer pizzaOrderId) {
		return ipizzaorderservice.viewPizzaOrderById(pizzaOrderId);
		
	}
	
	@GetMapping("/viewallporders")
	public List<PizzaOrder> viewAllPizzaOrders(){
		return ipizzaorderservice.viewAllPizzaOrders();
		
	}

	@GetMapping("/viewbydates/{startDate}/{endDate}")
	public 	List<PizzaOrder> viewPizzaOrderByStartAndEndDate(@PathVariable("startDate") LocalDate startDate, @PathVariable ("endDate") LocalDate endDate){
		return ipizzaorderservice.viewPizzaOrderByStartAndEndDate(startDate, endDate);
		
	}

	
	@GetMapping("/viewpbyldate")
	public 	List<PizzaOrder> viewPizzaOrderByDate(@PathVariable LocalDate date){
		return ipizzaorderservice.viewPizzaOrderByDate(date);
		
	}
	
	
	public 	List<PizzaOrder> viewPizzaOrderByCustomerId(Integer customerId){
		return null;
		
	}


	
}
