package com.sample.core.controller.pedido;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;
import com.sample.core.domain.Mesa;
import com.sample.core.domain.Pedido;
import com.sample.core.enums.PedidoEnum;
import com.sample.core.service.MesaService;
import com.sample.core.service.MesaServiceImp;
import com.sample.core.service.PedidoService;
import com.sample.core.service.PedidoServiceImp;

@WebServlet( urlPatterns =  "/pedidosTest")
public class PedidoController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	MesaService mesaService = new MesaServiceImp();
	PedidoService pedidoService = new PedidoServiceImp();
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idMesa = req.getParameter("idMesa");
		int idIntMesa = Integer.parseInt(idMesa);
		try {
			Pedido pedido = pedidoService.findByIdAndState(idIntMesa, PedidoEnum.PENDIENTE);
			req.setAttribute("pedidos",pedido);
			req.getRequestDispatcher("/pedido/pedido.jsp").forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



	
	
	
	
}
