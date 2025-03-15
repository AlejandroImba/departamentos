<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edificios</title>
<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-4">
 <nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="/bddepartamentos-web/">CONJUNTOSIMBA</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="nav nav-tabs">
  		<li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Edificios</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/bddepartamentos-web/">Inicio</a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="/bddepartamentos-web/areas/areassociales">Areas Sociales</a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="/bddepartamentos-web/reclamos/formreclamos">Dejar un reclamo</a>
        </li>
      </ul>
    </div>
                  <div class="d-flex">
        <a href="/bddepartamentos-web/login/" class="btn btn-outline-primary">Iniciar sesión como Admin</a>
      </div>
  </div>
</nav>
<h1 class="mb-4">Edificios</h1>


<!-- Tabla de Edificios -->
<table class="table table-bordered table-striped">
    <thead class="table-dark">
        <tr>
            <th>Color</th>
            <th>Número de Departamentos</th>
            <th>Pisos</th>
            <th>Ir</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="edificio" items="${edificios}">
            <tr>
                <td>${edificio.color}</td>
                <td>${edificio.num_dep}</td>
                <td>${edificio.pisos}</td>
                <td>
<button class="btn btn-info" type="button" 
        onclick="window.location.href='/bddepartamentos-web/departamentos/findByEdificio?idEdificio=${edificio.idEdificio}'">
    Ver departamentos
</button>                </td>
                
            </tr>
            </c:forEach>
            <!-- Sección de Departamentos -->

        
    </tbody>
</table>

<!-- Bootstrap JS (opcional, si necesitas funcionalidades de Bootstrap) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>