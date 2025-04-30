package com.sample.core.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sample.core.dao.config.Conexion;

public class Pedido_Entrega {
	
	private Conexion conexion = Conexion.getInstance(); // asumimos que maneja una sola base

	private static final String DELETE_PEDIDO_P = "DELETE FROM pedido_principal WHERE id = ?";
	private static final String DELETE_PEDIDO_C = "DELETE FROM pedido_cocina WHERE id = ?";
	private static final String DELETE_PEDIDO_E = "DELETE FROM pedido_entrega WHERE id = ?";

	public void eliminarPedidoEnTresBases(int idPedido) throws Exception {
		Connection conn = null;
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;
		PreparedStatement ps3 = null;

		try {
			conn = conexion.dameConnection(); // obtenés una sola conexión si las 3 tablas están en la misma base

			// Eliminar de pedido_principal
			ps1 = conn.prepareStatement(DELETE_PEDIDO_P);
			ps1.setInt(1, idPedido);
			ps1.executeUpdate();

			// Eliminar de pedido_cocina
			ps2 = conn.prepareStatement(DELETE_PEDIDO_C);
			ps2.setInt(1, idPedido);
			ps2.executeUpdate();

			// Eliminar de pedido_entrega
			ps3 = conn.prepareStatement(DELETE_PEDIDO_E);
			ps3.setInt(1, idPedido);
			ps3.executeUpdate();

			System.out.println("Pedido eliminado correctamente en las tres tablas.");

		} catch (Exception e) {
			System.err.println("Error al eliminar el pedido: " + e.getMessage());
			throw e;
		} finally {
			if (ps1 != null) ps1.close();
			if (ps2 != null) ps2.close();
			if (ps3 != null) ps3.close();
			if (conn != null) conn.close();
		}
	}
}
