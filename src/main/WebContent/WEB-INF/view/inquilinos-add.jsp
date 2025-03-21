<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" 
          rel="stylesheet" 
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" 
          crossorigin="anonymous">
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
          <a class="nav-link active" aria-current="page" href="#">Agregar Inquilino</a>
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
	<br>
	<div class="mb-3">
	<div class="d-grid gap-2 col-6 mx-auto">
<form action="add" method="post" class="row g-3">
<br>
    <!-- Campo oculto -->
    <input class="form-control" type="hidden" id="idInquilino" name="idInquilino" value="${inquilino.idInquilino}">

    <!-- Primera columna -->
    <div class="col-md-6">
        <label for="nombre" class="form-label">Nombre</label>
        <input class="form-control" type="text" id="nombre" name="nombre" value="${inquilino.nombre}">
        
        <label for="telefono" class="form-label">Teléfono</label>
        <input class="form-control" type="text" id="telefono" name="telefono" value="${inquilino.telefono}">
        
        <label for="correo" class="form-label">Correo Electrónico</label>
        <input class="form-control" type="text" id="correo" name="correo" value="${inquilino.correo}">
                <label for="idParqueadero" class="form-label">Parqueadero</label>
        <select class="form-select" aria-label="Default select example" id="idParqueadero" name="idParqueadero">
            <option value="">Sin parqueadero</option>
            <c:forEach var="item" items="${parqueaderos}">
                <option value="${item.idParqueadero}">${item.ubicacion}</option>
            </c:forEach>
        </select>
        
        <button type="button" class="btn btn-primary mt-3" onclick="window.location.href='/bddepartamentos-web/parqueaderos/findAll?idParqueadero=1';">Agregar Parqueadero</button>
    </div>

    <!-- Segunda columna -->
    <div class="col-md-6">
        <label for="apellido" class="form-label">Apellido</label>
        <input class="form-control" type="text" id="apellido" name="apellido" value="${inquilino.apellido}">
        
        <label for="telefonoReferencia" class="form-label">Teléfono de referencia</label>
        <input class="form-control" type="text" id="telefonoReferencia" name="telefonoReferencia" value="${inquilino.telefonoReferencia}">
                <label for="idEdificio" class="form-label">Edificio</label>
        <select class="form-select" aria-label="Default select example" id="idEdificio" name="idEdificio">
            <c:forEach var="item" items="${edificios}">
  			 <option value="${item.idEdificio}" ${item.idEdificio == inquilino.edificio.idEdificio ? 'selected': ''} >${item.color}</option>
 
            </c:forEach>
        </select>

        
        <label for="idAdministrador" class="form-label">Administrador</label>
        <select class="form-select" aria-label="Default select example" id="idAdministrador" name="idAdministrador">
            <c:forEach var="item" items="${administradores}">
                <option id="" value="${item.idAdministrador}">${item.nombre} ${item.apellido}</option>
 <option value="${item.idAdministrador}" ${item.idAdministrador == inquilino.administrador.idAdministrador ? 'selected': ''} >${item.nombre} ${item.apellido}</option>
                
            </c:forEach>
        </select>
        
        <div class="mt-3">
            <button class="btn btn-success me-2" type="submit">Guardar</button>
            <button class="btn btn-danger" type="button" onclick="window.location.href='/bddepartamentos-web/inquilinos/findAll'; return false;">Cancelar</button>
        </div>
    </div>
</form>
</div>
</div>


	
 
</body>
    <footer class="bg-dark text-white text-center p-3 mt-5">
        &copy; 2025 Alejandro Imbaquingo - Todos los derechos reservados
    </footer>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" 
        integrity="sha384-rZyXWXF2ckF4oOTElp00WcT2HU7FoszWkLrZOluHFPOTxvI5kciWORqlszH5Js4F" 
        crossorigin="anonymous"></script>
</html>