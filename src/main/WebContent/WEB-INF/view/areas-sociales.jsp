<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Áreas Sociales del Conjunto</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">CONJUNTOSIMBA</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="nav nav-tabs me-auto">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Áreas Sociales</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/bddepartamentos-web/edificios/findAll">Edificios</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/bddepartamentos-web/">Inicio</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/bddepartamentos-web/reclamos/formreclamos">Dejar un reclamo</a>
        </li>
      </ul>
      <!-- Botón de Iniciar sesión como Admin alineado a la derecha -->
      <div class="d-flex">
        <a href="/bddepartamentos-web/login/" class="btn btn-outline-primary">Iniciar sesión como Admin</a>
      </div>
    </div>
  </div>
</nav>
    <div class="container py-5">
        <h1 class="text-center mb-4">Áreas Sociales del Conjunto Residencial</h1>
        <div class="row">
            <div class="col-md-6 mb-4">
                <div class="card">
                    <img src="/bddepartamentos-web/resources/img/piscina.jpg" class="card-img-top" alt="Piscina del conjunto">
                    <div class="card-body">
                        <h5 class="card-title">Piscina</h5>
                        <p class="card-text">Una piscina amplia para el disfrute de los residentes.</p>
                    </div>
                </div>
            </div>
            <div class="col-md-6 mb-4">
                <div class="card">
                    <img src="/bddepartamentos-web/resources/img/infantil.png" class="card-img-top" alt="Parque Infantil">
                    <div class="card-body">
                        <h5 class="card-title">Parque Infantil</h5>
                        <p class="card-text">Un espacio seguro y divertido para los niños.</p>
                    </div>
                </div>
            </div>
            <div class="col-md-6 mb-4">
                <div class="card">
                    <img src="/bddepartamentos-web/resources/img/gym.jpg" class="card-img-top" alt="Gimnasio">
                    <div class="card-body">
                        <h5 class="card-title">Gimnasio</h5>
                        <p class="card-text">Equipado con todo lo necesario para mantenerse en forma.</p>
                    </div>
                </div>
            </div>
            <div class="col-md-6 mb-4">
                <div class="card">
                    <img src="/bddepartamentos-web/resources/img/bbq.png" class="card-img-top" alt="Zona BBQ">
                    <div class="card-body">
                        <h5 class="card-title">Zona BBQ</h5>
                        <p class="card-text">Un área perfecta para reuniones y asados con amigos.</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
 
