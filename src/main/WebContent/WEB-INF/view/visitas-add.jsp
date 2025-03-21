<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Añadir Visitas</title>
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
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Agregar Visitas</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/bddepartamentos-web/guardia">Guardia</a>
        </li>
      </ul>
      <!-- Botón de Salir -->
      <div class="d-flex">
        <a href="/bddepartamentos-web/" class="btn btn-outline-light">Salir del Modo Guardia</a>
      </div>
    </div>
  </div>
</nav>
<br>
<br>
	<div class="mb-3">
	<div class="d-grid gap-2 col-6 mx-auto">
	<form action="add" method="post">
		<input class="form-control" type="hidden" id="idVisita" name="idVisita" value="${visita.idVisita}">
		Nombre del Visitante
		<input class="form-control" type="text" id="nombreVisitante" name="nombreVisitante" value="${visita.nombreVisitante}">
		<br>
		    <div class="mb-3">
        <label for="fechaVisita" class="form-label">Fecha de la Visita</label>
       <br>
       <input type="date" name="fechaVisita" class="form-label"
       value="${not empty visita.fechaVisita ? fn:substring(visita.fechaVisita.toString(), 0, 10) : ''}" />
    </div>
    <br>
Motivo de la Visita
		<input class="form-control" type="text" id="motivoVisita" name="motivoVisita" value="${visita.motivoVisita}">
		<br>
Observaciones
		<input class="form-control" type="text" id="observaciones" name="observaciones" value="${visita.observaciones}">
		<br>
		
			Inquilino al que visita
			
			<select class="form-select" aria-label="Default select example" id="idInquilino" name="idInquilino">
			<c:forEach var="item" items="${inquilinos}">
			
			 <option value="${item.idInquilino}" ${item.idInquilino == visita.inquilino.idInquilino ? 'selected': ''} >${item.nombre} ${item.apellido}</option>
			</c:forEach>
			</select>

 <button class="btn btn-success" class="btn btn-primary" type="submit">Guardar</button>
  <button class="btn btn-danger" class="btn btn-primary" type="button" onclick="window.location.href='/bddepartamentos-web/visitas/findAll'; return false;">Cancelar</button>
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