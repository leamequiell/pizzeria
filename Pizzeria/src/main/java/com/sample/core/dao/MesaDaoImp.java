package com.sample.core.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sample.core.dao.config.Conexion;
import com.sample.core.domain.Mesa;
import com.sample.core.enums.EstadoMesa;

public class MesaDaoImp implements MesaDao {

private Conexion conexion = Conexion.getInstance();
	
	private static final String queryList = "SELECT id, numero, estado FROM mesa";
	
	private static final String queryConsultarPLato = "SELECT id, precio, descripcion, titulo FROM plato where id=?";
	
	private static final String queryAddPLato = "INSERT INTO plato ( precio, descripcion, titulo) VALUES (?,?,?)";

	
	public List<Mesa> list() throws Exception {
		
		PreparedStatement st =conexion.dameConnection().prepareCall(queryList);
		ResultSet rs = null;
		rs = st.executeQuery();
		List<Mesa> mesas = new ArrayList<Mesa>();
		while (rs.next())
		{
			mesas.add(new Mesa(rs.getInt(1),rs.getInt(2),
					EstadoMesa.obtenerEstado(rs.getString(3))));
		}
		
		return mesas;
	}

	
	
	
}
