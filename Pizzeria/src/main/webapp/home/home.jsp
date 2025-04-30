<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>

	<script src="<%=request.getContextPath()%>/scripts/jquery/jquery.min.js"></script>
	
	<script type="text/javascript">
			var contextPath="<%=request.getContextPath()%>";
	</script>
	<script src="<%=request.getContextPath()%>/scripts/scripts-barcito.js"></script>
		<script src="<%=request.getContextPath()%>/scripts/logout.js"></script>
	
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
		    <p class="card-text">Platos disponibles</p>
		    <a href="<%= request.getContextPath()%>/LeerDatosPlato" class="btn btn-primary">Ir</a>
		  </div>
		</div>
		
		<div class="card m-2" >
		  <img class="card-img-top" src="https://cdn.pixabay.com/photo/2017/08/06/04/16/cupcake-2588646_1280.jpg" alt="Card image cap">
		  <div class="card-body">
		    <h5 class="card-title">Postres</h5>
		    <p class="card-text">postres disponibls</p>
		    <a href="<%= request.getContextPath()%>/LeerDatosPostre" class="btn btn-primary"  >Ir</a>
		  </div>
		</div>
		
		<div class="card m-2" >
		  <img class="card-img-top" src="https://cdn.pixabay.com/photo/2020/08/17/13/24/flower-5495384_1280.jpg" alt="Card image cap">
		  <div class="card-body">
		    <h5 class="card-title">Bebidas</h5>
		    <p class="card-text">Bebida disponible</p>
		    <a href="<%= request.getContextPath()%>/LeerDatosBebidas" class="btn btn-primary">Ir</a>
		  </div>
		</div>
		
		<div class="card m-2" >
		  <img class="card-img-top" src="https://cdn.pixabay.com/photo/2016/11/29/12/54/cafe-1869656_1280.jpg" alt="Card image cap">
		  <div class="card-body">
		    <h5 class="card-title">Menu</h5>
		    <p class="card-text">menu disponibles</p>
		    <a href="<%= request.getContextPath()%>/leerDatosMenu" class="btn btn-primary">Ir</a>
		  </div>
		</div>
		
	</div>
	<nav class="navbar navbar-light bg-light">
	  <a class="navbar-brand" href="#">Mesas</a>
	</nav>

	<div class="card-group homeitem mt-4"  id="boxGroupMesas">
		<!-- 
		<div class="card m-2" >
		  <div class="card-body">
		    <h5 class="card-title">Mesa 1</h5>
		    <a href="#" class="btn btn-primary">Pedidos</a>
		    <a href="#" class="btn btn-danger">Reservar</a>    
		  </div>
		</div>
	
		<div class="card m-2" >
		  <div class="card-body">
		    <h5 class="card-title">Mesa 2</h5>
		    <a href="#" class="btn btn-primary">Pedidos</a>
		    <a href="#" class="btn btn-danger">Reservar</a>
		  </div>
		</div>
		
			<div class="card m-2" >
			  <div class="card-body">
			    <h5 class="card-title">Mesa 3</h5>
			    <a href="#" class="btn btn-primary">Pedidos</a>
			    <a href="#" class="btn btn-danger">Reservar</a>  
			  </div>
			</div>
			<div class="card m-2" >
			  <div class="card-body">
			    <h5 class="card-title">Mesa 4</h5>
			    <a href="#" class="btn btn-primary">Pedidos</a>
			    <a href="#" class="btn btn-danger">Reservar</a>  
			  </div>
			</div>
			 -->
	</div>


</div>



					
</body>
</html>