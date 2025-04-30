package com.sample.core.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sample.core.dao.config.Conexion;

public class Pasaje_PedidoP_PedidoC {

    private Conexion conexion = Conexion.getInstance();

    private static final String SELECT_PEDIDO_P = 
        "SELECT id_pedido, Tipo_Pizza, Precio FROM pedido_principal WHERE id = ?";

    private static final String INSERT_PEDIDO_C = 
        "INSERT INTO pedido_cocina (id_pedido, Tipo_Pizza, Precio) VALUES (?, ?, ?)";

    public void pasarPedidoAPreparacion(int idPedido) throws Exception {
        Connection conn = null;
        PreparedStatement psSelect = null;
        PreparedStatement psInsert = null;
        ResultSet rs = null;

        try {
            conn = conexion.dameConnection();

            // 1. Obtener el pedido desde pedido_principal
            psSelect = conn.prepareStatement(SELECT_PEDIDO_P);
            psSelect.setInt(1, idPedido);
            rs = psSelect.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("id_pedido");
                String tipoPizza = rs.getString("Tipo_Pizza");
                int precio = rs.getInt("Precio");

                // 2. Insertar el pedido en pedido_cocina
                psInsert = conn.prepareStatement(INSERT_PEDIDO_C);
                psInsert.setInt(1, id);
                psInsert.setString(2, tipoPizza);
                psInsert.setInt(3, precio);
                psInsert.executeUpdate();

                System.out.println("✅ Pedido pasado a cocina correctamente.");
            } else {
                System.out.println("⚠️ No se encontró el pedido con ID: " + idPedido);
            }

        } catch (Exception e) {
            System.err.println("❌ Error al transferir el pedido: " + e.getMessage());
            throw e;
        } finally {
            if (rs != null) rs.close();
            if (psSelect != null) psSelect.close();
            if (psInsert != null) psInsert.close();
            if (conn != null) conn.close();
        }
    }
}


