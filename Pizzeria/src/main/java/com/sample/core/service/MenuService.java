package com.sample.core.service;

import java.util.List;

import com.sample.core.domain.Menu;

public interface MenuService {

	public List<Menu> listar() throws Exception;
	
	public void addMenu (Menu menu) throws Exception;
	
	public Menu findById(int id ) throws Exception;
}
