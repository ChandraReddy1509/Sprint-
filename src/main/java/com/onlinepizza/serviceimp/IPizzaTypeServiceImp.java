package com.onlinepizza.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinepizza.entity.PizzaType;
import com.onlinepizza.repository.PizzaTypeRepository;
import com.onlinepizza.service.IPizzaTypeService;

@Service
public class IPizzaTypeServiceImp implements IPizzaTypeService {

	@Autowired
	PizzaTypeRepository pizzaTypeRepository;
	
	
	@Override
	public String addPizzaType(PizzaType pizzaType) {
		pizzaTypeRepository.save(pizzaType);
		return "Added PizzaType successfully";
	}

	@Override
	public String deleteById(Integer pizzaTypeId) {
		pizzaTypeRepository.deleteById(pizzaTypeId);
		return "PizzaType Removed";
	}

	@Override
	public List<PizzaType> viewPizzaType() {
	
		return 	pizzaTypeRepository.findAll();
	}

}
