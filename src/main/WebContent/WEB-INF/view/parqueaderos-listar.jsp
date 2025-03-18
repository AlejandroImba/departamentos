<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Administradores</title>
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" 
          rel="stylesheet" 
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" 
          crossorigin="anonymous">
</head>
<body>

<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="/bddepartamentos-web/admin">CONJUNTOSIMBA</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="nav nav-tabs me-auto">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Inquilino-Parqueadero</a>
        </li>
                <li class="nav-item">
          <a class="nav-link" href="/bddepartamentos-web/administradores/findAll?idAdministrador=1">Administradores</a>
        </li>
                <li class="nav-item">
          <a class="nav-link" href="/bddepartamentos-web/admin">Inicio</a>
        </li>
                <li class="nav-item">
          <a class="nav-link" href="#">Guardias</a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="#">Reservas</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Reclamos</a>
        </li>
      </ul>
      <!-- Botón de Iniciar sesión como Admin alineado a la derecha -->
      <div class="d-flex">
        <a href="/bddepartamentos-web/" class="btn btn-outline-primary">Salir del modo administrador</a>
      </div>
    </div>
  </div>
</nav>

	 <center><button type="button" class="btn btn-primary" onclick="window.location.href='/bddepartamentos-web/parqueaderos/findOne?opcion=1'; return false;">Agregar</button></center>
	<br>
		 <center><button type="button" class="btn btn-info" onclick="window.location.href='/bddepartamentos-web/inquilinos/findOne?opcion=1'; return false;">Ir a agregar Inquilino</button></center>
	<br>
	<table class="table table-striped">
 		<thead>
			<tr>
				<th>idParqueadero</th>
				<th>Ubicacion</th>
				<th>Disponibilidad</th>
				<th>Edificio</th>
				<th>Administrador</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${parqueaderos}">
				<tr>
					<td>${item.idParqueadero}</td>
					<td>${item.ubicacion}</td>
					<td>${item.disponibilidad}</td>
					<td>${item.edificio.color}</td>
					<td>${item.administrador.nombre} ${item.administrador.apellido}</td>
					<td>
		<button type="button" class="btn btn-success"
		onclick="window.location.href='/bddepartamentos-web/parqueaderos/findOne?opcion=1&idParqueadero=${item.idParqueadero}'; return false;">Actualizar</button>
						 
						<button type="button" class="btn btn-danger" onclick="window.location.href='/bddepartamentos-web/parqueaderos/findOne?opcion=2&idParqueadero=${item.idParqueadero}'; return false;">Borrar</button>
					</td>
				</tr>
			</c:forEach>			
		</tbody>
</table>
 
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" 
        integrity="sha384-rZyXWXF2ckF4oOTElp00WcT2HU7FoszWkLrZOluHFPOTxvI5kciWORqlszH5Js4F" 
        crossorigin="anonymous"></script>

</body>
</html>