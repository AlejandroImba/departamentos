<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agregar Administrador</title>
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
          <a class="nav-link active" aria-current="page" href="#">Agregar Administradores</a>
        </li>
                <li class="nav-item">
          <a class="nav-link" href="/bddepartamentos-web/admin">Inicio</a>
        </li>
                <li class="nav-item">
          <a class="nav-link" href="/bddepartamentos-web/inquilinos/findAll">Inquilinos</a>
        </li>
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
	<div class="mb-3">
	<div class="d-grid gap-2 col-6 mx-auto">
	
	<br>
<form action="add" method="POST">
	<input type="hidden" id="idAdministrador" name="idAdministrador" value="${administrador.idAdministrador}" />
   <label for="exampleFormControlInput1" class="form-label">Nombre</label>
    <input type="text" class="form-control" id="exampleFormControlInput1" id="nombre" name="nombre" placeholder="Nombre" value="${administrador.nombre}" />
   <br>
   <label for="exampleFormControlInput1" class="form-label">Apellido</label>
   	<input type="text" class="form-control" id="exampleFormControlInput1" id="apellido" name="apellido" placeholder="Apellido" value="${administrador.apellido}" />
		<br>
   <label for="exampleFormControlInput1" class="form-label">Teléfono</label>
   	<input type="text" class="form-control" id="exampleFormControlInput1" id="telefono" name="telefono" placeholder="Teléfono" value="${administrador.telefono}" />
		<br>   <label for="exampleFormControlInput1" class="form-label">Correo</label>
   	<input type="email" class="form-control" id="exampleFormControlInput1" id="correo" name="correo" placeholder="Correo" value="${administrador.correo}" />
		<br>
		   <label for="exampleFormControlInput1" class="form-label">Código</label>
   	<input type="number" class="form-control" id="exampleFormControlInput1" id="codigo" name="codigo" placeholder="Código" value="${administrador.codigo}" />
		<br>

  <button class="btn btn-success" class="btn btn-primary" type="submit">Guardar</button>
  <button class="btn btn-danger" class="btn btn-primary" type="button" onclick="window.location.href='/bddepartamentos-web/administradores/findAll'; return false;">Cancelar</button>
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