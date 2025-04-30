package com.sample.core.service;

import java.util.List;

import com.sample.core.dao.MesaDao;
import com.sample.core.dao.MesaDaoImp;
import com.sample.core.domain.Mesa;
import com.sample.core.enums.EstadoMesa;

public class MesaServiceImp implements MesaService{

	private MesaDao mesaDao = new MesaDaoImp();
	
	public List<Mesa> list() throws Exception {
		return mesaDao.list();
	}

	public Mesa findOne(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void changeState(int id, EstadoMesa estadoMesa) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void save(int numero, EstadoMesa estadoMesa) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
