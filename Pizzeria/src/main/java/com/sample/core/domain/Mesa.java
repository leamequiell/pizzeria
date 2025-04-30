package com.sample.core.domain;

import java.util.ArrayList;
import java.util.List;

import com.sample.core.enums.EstadoMesa;

public class Mesa {

	private int id;

	private int numero;
	
	private EstadoMesa estadoMesa;
	
	
	
	public Mesa(int id, int numero, EstadoMesa estadoMesa) {
		super();
		this.id = id;
		this.numero = numero;
		this.estadoMesa = estadoMesa;
	}


	private List<Pedible> pedidos = new ArrayList<Pedible>();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public void agregarPedible(Pedible pedible){
		this.pedidos.add(pedible);
	}
	
	
	
}
