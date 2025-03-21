<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inquilinos</title>
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" 
          rel="stylesheet" 
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" 
          crossorigin="anonymous">
                        <link rel="icon" href="/bddepartamentos-web/resources/img/logo.png">
                           <link rel="stylesheet" href="/bddepartamentos-web/resources/css/css.css">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="/bddepartamentos-web/admin">CONJUNTOSIMBA</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="nav nav-tabs me-auto">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Inquilino</a>
        </li>
                <li class="nav-item">
          <a class="nav-link" href="/bddepartamentos-web/administradores/findAll?idAdministrador=1">Administradores</a>
        </li>
                <li class="nav-item">
          <a class="nav-link" href="/bddepartamentos-web/admin">Inicio</a>
                  <li class="nav-item">
          <a class="nav-link" href="/bddepartamentos-web/reclamos/formreclamos">Agregar Reclamo</a>
        </li>
      </ul>
      <!-- Botón de Iniciar sesión como Admin alineado a la derecha -->
      <div class="d-flex">
        <a href="/bddepartamentos-web/" class="btn btn-outline-primary">Salir del modo administrador</a>
      </div>
    </div>
  </div>
</nav>
	<% if (request.getAttribute("errorMessage") != null) { %>
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    <script>
        document.addEventListener("DOMContentLoaded", function() {
            Swal.fire({
                title: "Error",
                text: "<%= request.getAttribute("errorMessage") %>",
                icon: "error",
                confirmButtonText: "Aceptar"
            });
        });
    </script>
<% } %>

<% if (request.getAttribute("successMessage") != null) { %>
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    <script>
        document.addEventListener("DOMContentLoaded", function() {
            Swal.fire({
                title: "Éxito",
                text: "<%= request.getAttribute("successMessage") %>",
                icon: "success",
                confirmButtonText: "Aceptar"
            });
        });
    </script>
<% } %>

<br>
	 <center><button type="button" class="btn btn-primary" onclick="window.location.href='/bddepartamentos-web/inquilinos/findOne?opcion=1'; return false;">Agregar</button></center>
	<table class="table table-striped">
 		<thead>
			<tr>
				<th>idInquilino</th>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Teléfono</th>
				<th>Teléfono de referencia</th>
				<th>Correo</th>
				<th>Edificio</th>
				<th>Parqueadero</th>
				<th>Administrador</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${inquilinos}">
				<tr>
					<td>${item.idInquilino}</td>
					<td>${item.nombre}</td>
					<td>${item.apellido}</td>
					<td>${item.telefono}</td>
					<td>${item.telefonoReferencia}</td>
					<td>${item.correo}</td>
					<td>${item.edificio.color}</td>
					<td>${item.parqueadero.ubicacion}</td>
					<td>${item.administrador.nombre} ${item.administrador.apellido}</td>
					<td>
						<button type="button" class="btn btn-success"
						 onclick="window.location.href='/bddepartamentos-web/inquilinos/findOne?opcion=1&idInquilino=${item.idInquilino}'; return false;">Actualizar</button>
						<button type="button" class="btn btn-danger" onclick="window.location.href='/bddepartamentos-web/inquilinos/findOne?opcion=2&idInquilino=${item.idInquilino}'; return false;">Borrar</button>
					</td>
				</tr>
			</c:forEach>			
		</tbody>
</table>
 
</body>
    <footer class="bg-dark text-white text-center p-3 mt-5">
        &copy; 2025 Alejandro Imbaquingo - Todos los derechos reservados
    </footer>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" 
        integrity="sha384-rZyXWXF2ckF4oOTElp00WcT2HU7FoszWkLrZOluHFPOTxvI5kciWORqlszH5Js4F" 
        crossorigin="anonymous"></script>
</html>