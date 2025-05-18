package com.sample.core.controller.usuario;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.JsonObject;
import com.sample.core.service.LoginService;
import com.sample.core.service.LoginServicelmp;
import com.sample.core.dao.LoginDaolmp;

@WebServlet( urlPatterns =  "/ingresarUsuario")
public class IngresarUsuario extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	LoginService usuarioservice = new LoginServicelmp();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    resp.setContentType("text/plain");
	    resp.getWriter().write("Este endpoint solo acepta peticiones POST.");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String usuario = req.getParameter("usuario");
		String contrasena = req.getParameter("contrasena");		
		System.out.println("Usuario: " + usuario);
		System.out.println("Contraseña: " + contrasena);
		try {
			
			if (usuario == null || usuario.length() == 0)
				throw new Exception("usuario vacio");
			
			if (contrasena == null || contrasena.length() == 0)
				throw new Exception("contrasena vacio");
					
			usuarioservice.consultarUsuario(usuario);
			usuarioservice.consultarUsuarioYcontrasena(usuario, contrasena);
			
			String rol = (String) req.getSession().getAttribute("ROL_USUARIO");  // Método en servicio o DAO que obtiene el rol
			req.getSession().setAttribute("ROL_USUARIO", rol);
			
			HttpSession jsession = req.getSession(true);
			jsession.setAttribute("CURRENT_USER", usuario);
			resp.addCookie(new Cookie("JSESSIONID", jsession.getId()));

			setOutResponse("se logeo corretamente", resp, 200, "ok");

		} catch (Exception e) {
			setOutResponse(e.getMessage(), resp, 400, "error");
		}

	}
	

	private void setOutResponse(String mensaje,HttpServletResponse resp, int code, String status) throws IOException {
		 PrintWriter out = resp.getWriter();
		 resp.setContentType("application/json");
		 resp.setCharacterEncoding("utf-8");
		 JsonObject obj = new JsonObject();
		 resp.setStatus(code);
		 obj.addProperty("estatus", status);
		 obj.addProperty("mensaje",mensaje);
		 out.print(obj.toString());
		 out.flush();
	}
	
}
