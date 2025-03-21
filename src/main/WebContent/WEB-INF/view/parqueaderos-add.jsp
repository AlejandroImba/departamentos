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
</head>
<body>
<h1>Inquilinos</h1>
	
	<div class="mb-3">
	<div class="d-grid gap-2 col-6 mx-auto">
<form action="add" method="post">
		<input class="form-control" type="hidden" id="idInquilino" name="idInquilino" value="${parqueadero.idParqueadero}">
		Ubicacion
		<input class="form-control" type="text" id="ubicacion" name="ubicacion" value="${parqueadero.ubicacion}">
		<br>
		Disponibilidad
		<input class="form-control" type="text" id="disponibilidad" name="disponibilidad" value="${parqueadero.disponibilidad}">
		<br>
			edificio
			<select class="form-select" aria-label="Default select example" id="idEdificio" name="idEdificio">
			<c:forEach var="item" items="${edificios}">
			 <option value="${item.idEdificio}" ${item.idEdificio == parqueadero.edificio.idEdificio ? 'selected': ''} >${item.color}</option>
			</c:forEach>
			</select>
			<br>
			Administrador
			<select class="form-select" aria-label="Default select example" id="idAdministrador" name="idAdministrador">
			<c:forEach var="item" items="${administradores}">
			 <option value="${item.idAdministrador}" ${item.idAdministrador == parqueadero.administrador.idAdministrador ? 'selected': ''} >${item.nombre} ${item.apellido}</option>
			</c:forEach>
			</select>
			<br>
 <button class="btn btn-success" class="btn btn-primary" type="submit">Guardar</button>
  <button class="btn btn-danger" class="btn btn-primary" type="button" onclick="window.location.href='/bddepartamentos-web/parqueaderos/findAll'; return false;">Cancelar</button>
	</form>
</div>
</div>


	
 
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" 
        integrity="sha384-rZyXWXF2ckF4oOTElp00WcT2HU7FoszWkLrZOluHFPOTxvI5kciWORqlszH5Js4F" 
        crossorigin="anonymous"></script>
</html>