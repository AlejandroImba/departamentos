<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" 
        integrity="sha384-rZyXWXF2ckF4oOTElp00WcT2HU7FoszWkLrZOluHFPOTxvI5kciWORqlszH5Js4F" 
        crossorigin="anonymous"></script>
</html>