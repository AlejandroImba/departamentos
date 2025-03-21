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
</head>
<body>
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
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" 
        integrity="sha384-rZyXWXF2ckF4oOTElp00WcT2HU7FoszWkLrZOluHFPOTxvI5kciWORqlszH5Js4F" 
        crossorigin="anonymous"></script>
</html>