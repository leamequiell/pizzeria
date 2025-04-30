<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.Import"%>  
<%@page import="java.util.*"%>
<%@page import="com.sample.core.domain.Pizza"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<meta charset="ISO-8859-1">
	<title>PIZZERIA</title>

	<script src="<%=request.getContextPath()%>/scripts/jquery/jquery.min.js"></script>
	
	<script type="text/javascript">
			var contextPath="<%=request.getContextPath()%>";
	</script>
	<script src="<%=request.getContextPath()%>/scripts/scripts-barcito.js"></script>
		<script src="<%=request.getContextPath()%>/scripts/logout.js"></script>
	<script src="<%=request.getContextPath()%>/scripts/eliminarPizza.js"> </script>
	<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
</head>
<body>

<div class="container">

	<div class="alert alert-block">
		
	</div>

	<div class="recent_order">
				<h1>Pedidos </h1>
		  <button type="button" class="btn btn-primary" id="btn-logout">Log Out</button>
				
				
				
				<table id="boxPedidosSolicitados">
					<thead>
						<tr>
							<th width="25%">Fecha</th>
							<th width="12%" class="center">Identificador</th>
							<th width="12%" class="center">Direccion</th>
							<th width="12%" class="center">Estado</th>
							<th width="12%" class="center">Telefono</th>
							<th width="12%" class="center">Monto</th>
							<th width="12%" class="center">Ver detalles</th>
						</tr>
					</thead>
					<tbody>
						<tr class="">
							<td width="25%" class="fecha">test</td>
							<td width="12%" class="identificador">test</td>
							<td width="25%" class="direccion">test</td>
							<td width="25%" class="estado">test</td>
							<td width="25%" class="te�efono">test</td>
							<td width="25%" class="monto">test</td>
							<td width="25%" class="detalles"></td>
						</tr>
					</tbody>
				</table>
				
	</div>

	<nav class="navbar navbar-light bg-light mt-4">
	  <a class="navbar-brand" href="#">Productos</a>
	</nav>
	<div class="card-group homeitem mt-4" 1>
		<div class="card m-2" >
		  <img class="card-img-top" src="https://cdn.pixabay.com/photo/2023/05/31/11/15/fish-8031138_960_720.jpg" alt="Card image cap">
		  <div class="card-body">
		    <h5 class="card-title">Plato</h5>
		    <p class="card-text">Pizza disponibles</p>
		    <a href="<%= request.getContextPath()%>/LeerDatosPlato" class="btn btn-primary">Ir</a>
		  </div>
		</div>
		
		
	</div>
	<nav class="navbar navbar-light bg-light">
	  <a class="navbar-brand" href="#">Mesas</a>
	</nav>

	<div class="card-group homeitem mt-4"  id="boxGroupMesas">


		
</body>
</html>