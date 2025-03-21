<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Realizar un Reclamo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
                  <link rel="icon" href="/bddepartamentos-web/resources/img/logo.png">
                     <link rel="stylesheet" href="/bddepartamentos-web/resources/css/css.css">
</head>
<body class="bg-light">
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="/bddepartamentos-web/admin">CONJUNTOSIMBA</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="nav nav-tabs me-auto">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Agregar Reclamo</a>
        </li>
                <li class="nav-item">
          <a class="nav-link" href="/bddepartamentos-web/admin">Inicio</a>
        </li>
                <li class="nav-item">
          <a class="nav-link" href="/bddepartamentos-web/inquilinos/findAll">Inquilinos</a>
        </li>
                  <li class="nav-item">
          <a class="nav-link" href="/bddepartamentos-web/administradores/findAll">Administradores</a>
        </li>
      </ul>
      <!-- Botón de Iniciar sesión como Admin alineado a la derecha -->
      <div class="d-flex">
        <a href="/bddepartamentos-web/" class="btn btn-outline-primary">Salir del modo administrador</a>
      </div>
    </div>
  </div>
</nav>
<div class="container py-5">
    <h1 class="text-center mb-4">Realizar un Reclamo</h1>
<form class="mt-3" action="${pageContext.request.contextPath}/reclamos/insertar" method="post">
<br>
    <div class="mb-3">
        <label for="fecha" class="form-label">Fecha</label>
        <input type="date" class="form-control" id="fecha" name="fecha_reclamo" required>
    </div>
    <div class="mb-3">
        <label for="mensaje" class="form-label">Descripción del Reclamo</label>
        <textarea class="form-control" id="mensaje" name="descripcion" rows="4" required></textarea>
    </div>
    <div class="mb-3">
        <label for="inquilino" class="form-label">Inquilino</label>
        <select class="form-select" id="inquilino" name="id_inquilino" required>
            <c:forEach var="inquilino" items="${inquilinos}">
                <option value="${inquilino.idInquilino}">${inquilino.nombre} ${inquilino.apellido}</option>
            </c:forEach>
        </select>
    </div>
    <button type="submit" class="btn btn-primary">Enviar Reclamo</button>
</form>
</div>
<script>
    // Función para establecer la fecha actual en el campo de fecha
    function establecerFechaActual() {
        const fechaInput = document.getElementById('fecha');
        const fechaActual = new Date();
        const fechaFormateada = fechaActual.toISOString().split('T')[0]; // Formato YYYY-MM-DD
        fechaInput.value = fechaFormateada;
        fechaInput.max = fechaFormateada; // Establece la fecha máxima permitida
    }

    // Llamar a la función al cargar la página
    window.onload = establecerFechaActual;

    // Función para validar la fecha
    function validarFecha(event) {
        const fechaInput = document.getElementById('fecha').value;
        const fechaSeleccionada = new Date(fechaInput);
        const fechaActual = new Date();

        // Comparar las fechas sin tener en cuenta la hora
        fechaSeleccionada.setHours(0, 0, 0, 0);
        fechaActual.setHours(0, 0, 0, 0);

        if (fechaSeleccionada > fechaActual) {
            alert("No se permiten fechas futuras. Por favor, selecciona una fecha válida.");
            event.preventDefault(); // Evita que el formulario se envíe
            return false;
        }
        return true; // Permite que el formulario se envíe
    }
</script>	
</body>
    <footer class="bg-dark text-white text-center p-3 mt-5">
        &copy; 2025 Alejandro Imbaquingo - Todos los derechos reservados
    </footer>
</html>