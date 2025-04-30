package com.sample.core.service;

import java.util.List;
import com.sample.core.dao.MenuDao;
import com.sample.core.dao.MenuDaoImp;
import com.sample.core.domain.Menu;

public class MenuServiceImp implements MenuService{

	MenuDao menuDao = new MenuDaoImp();
		
	public List<Menu> listar() throws Exception {
		return menuDao.listarMenu();
	}

	public void addMenu(Menu menu) throws Exception {
		this.menuDao.addMenu(menu);
	}

	public Menu findById(int id) throws Exception {
		return this.menuDao.findById(id);
	}

}
