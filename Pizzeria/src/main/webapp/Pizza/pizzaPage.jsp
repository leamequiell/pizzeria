<%@page import="org.apache.jasper.tagplugins.jstl.core.Import"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@page import="com.sample.core.domain.Pizza"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<script src="<%=request.getContextPath()%>/scripts/jquery/jquery.min.js"></script>

<script type="text/javascript">
			var contextPath='<%=request.getContextPath()%>
	';
</script>
<script src="<%=request.getContextPath()%>/scripts/eliminarPizza.js">
	
</script>

<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>

</head>
<body>

	<div class="container mt-4">


		<span> <a class="btn btn-primary"
			href="<%=request.getContextPath()%>/formulario?form=pizzaform">
				Nuevo </a>
		</span>

		<%
		List<Pizza> pizza = (List) request.getAttribute("pizza");
		%>

		<%
		for (int i = 0; i < pizza.size(); i++) {
		%>
		
		<div class="card" style="width: 18rem;">
			<div class="card-body">
				<h5 class="card-title"><%=pizza.get(i).getTitulo()%></
				</h5>
				<p class="card-text"><%=pizza.get(i).getDescripcion()%></p>
				<span class="badge badge-warning"><%=pizza.get(i).getPrecio()%></span>
				<button class="btn btn-danger" data-id="<%=pizza.get(i).getId()%>"
					onClick="myFunction(this)">eliminar</button>
			</div>
		</div>
		<%
		}
		%>
	</div>
</body>
</html>