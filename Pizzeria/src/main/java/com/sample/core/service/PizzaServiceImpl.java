package com.sample.core.service;

import java.util.List;

import com.sample.core.dao.PizzaDao;
import com.sample.core.dao.PizzaDaoImp;
import com.sample.core.domain.Pizza;

public class PizzaServiceImpl implements PlatoService{

	private PizzaDao platoDao = new PizzaDaoImp();
	
	
	public List<Pizza> listarPlatos() throws Exception {
		return pizzaDao.list();
	}

	public Pizza consultarPLato(int id) throws Exception {
		return pizzaDao.findById(id);
	}

	public void crearPizza(String titulo, String descripcion, int precio) throws Exception {
		pizzaDao.save(titulo, descripcion, precio);
	}
	
	public void delete(int id) throws Exception{
		pizzaDao.delete(id);
	}

}
