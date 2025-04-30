package com.sample.core.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sample.core.dao.config.Conexion;
import com.sample.core.domain.Usuario;
import com.sample.core.exceptions.ErrorException;

public class LoginDaolmp implements LoginDao {

	private Conexion conexion = Conexion.getInstance();

	private static final String queryFindByUser = "SELECT id, usuario, contrasena FROM administrador where usuario = ?";

	private static final String queryFindByUserAndContrasena = "SELECT id, usuario, contrasena FROM administrador where usuario = ? and contrasena = ?";

	private static final String queryList = "SELECT id, usuario, contrasena FROM administrador";

	private static final String queryConsultarUsuario = "SELECT id, usuario, contrasena FROM administrador where id=?";

	public List<Usuario> list() throws Exception {
		ResultSet rs = null;
		List<Usuario> Usuario = null;
		Usuario usuario = null;
		PreparedStatement st = null;
		try {
			st = conexion.dameConnection().prepareStatement(queryList);
			rs = st.executeQuery();
			Usuario = new ArrayList<Usuario>();
			while (rs.next()) {
				usuario = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3));
				Usuario.add(usuario);
			}

		} catch (Exception e) {
			throw new ErrorException("Hubo un error al realizar la consulta", e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (st != null)
					st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return Usuario;
	}

	public Usuario findById(int id) throws Exception {
		ResultSet rs = null;
		PreparedStatement st = null;
		try {
			st = conexion.dameConnection().prepareStatement(queryConsultarUsuario);
			st.setInt(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				return new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3));
			}

		} catch (Exception e) {
			throw new ErrorException("Hubo un error al realizar la consulta", e);
		} finally {
			try {
				st.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return null;
	}

	private void finalizarConexion(PreparedStatement st) {
		try {
			if (st != null)
				st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void existeUsuario(String usuario) throws Exception {

		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			System.out.println("Buscando el usuario1: " + usuario);
			st = this.conexion.dameConnection().prepareStatement(queryFindByUser);
			System.out.println("Buscando el usuario2: " + usuario);
			st.setString(1, usuario);
			System.out.println("Buscando el usuario3: " + usuario);
			rs = st.executeQuery();
			System.out.println("Buscando el usuario4: " + usuario);
			boolean encontro = rs.next();
			System.out.println("Buscando el usuario5: " + usuario);
			if (!encontro) {
				throw new Exception("El usuario " + usuario + "no exite en DB");
			}
			System.out.println("Buscando el usuario6: " + usuario);
		} catch (Exception e) {
			throw new Exception("No existe el usuario");
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (st != null)
					st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void existeUsuarioContrasena(String usuario, String contrasena) throws Exception {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {

			st = this.conexion.dameConnection().prepareStatement(queryFindByUserAndContrasena);

			st.setString(1, usuario);
			st.setString(2, contrasena);

			rs = st.executeQuery();
			boolean encontro = rs.next();

			if (!encontro) {
				throw new Exception("El usuario " + usuario + " no coincide con la contrasena");
			}
		} catch (Exception e) {
			throw new Exception("login incorrecto");
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (st != null)
					st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void agregarReintento(String usuario) throws Exception {

	}

}
