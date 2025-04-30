package com.sample.core.controller.mesa;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.sample.core.service.MesaService;
import com.sample.core.service.MesaServiceImp;

@WebServlet("/mesas")
public class MesaController extends HttpServlet{

	private MesaService mesaService = new MesaServiceImp();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// retornar mesas
			
		String json;
			try {
				json = new Gson().toJson(mesaService.list());
				resp.setContentType("applycation/json");
				resp.setCharacterEncoding("UTF-8");
				resp.getWriter().write(json);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	
	
	
}
