package com.sample.core.dao;

import java.util.List;

import com.sample.core.domain.Menu;

public interface MenuDao {

	public List<Menu> listarMenu() throws Exception;
	
	public void addMenu(Menu menu) throws Exception;

	public Menu findById(int id) throws Exception;
	
	
}
