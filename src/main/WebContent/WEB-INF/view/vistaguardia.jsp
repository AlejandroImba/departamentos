<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Panel de Guardia - Conjunto Residencial</title>
                        <link rel="icon" href="/bddepartamentos-web/resources/img/logo.png">
   <link rel="stylesheet" href="/bddepartamentos-web/resources/css/css.css">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" 
          rel="stylesheet" 
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" 
          crossorigin="anonymous">
    <style>
        .hero {
            background: url('https://source.unsplash.com/1600x900/?security,gate') center/cover;
            height: 300px;
            display: flex;
            align-items: center;
            justify-content: center;
            color: black;
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.7);
            text-align: center;
        }
        body {
            background-color: #f8f9fa;
        }
        .card {
            border: none;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }
        .footer {
            background-color: #212529;
            color: white;
            padding: 1rem 0;
        }
    </style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="/bddepartamentos-web/admin">CONJUNTOSIMBA</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="nav nav-tabs me-auto">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Guardia</a>
        </li>
                <li class="nav-item">
          <a class="nav-link" href="/bddepartamentos-web/visitas/findAll?idVisita=1">Gestión de Visitas</a>
      </ul>
      <!-- Botón de Iniciar sesión como Admin alineado a la derecha -->
      <div class="d-flex">
        <a href="/bddepartamentos-web/" class="btn btn-outline-light">Salir del Modo Guardia</a>
      </div>
    </div>
  </div>
</nav>
<!-- Hero Section -->
<header class="hero">
    <div>
        <h1>Bienvenido, Guardia</h1>
        <p>Gestiona el acceso y asegura el bienestar del conjunto residencial</p>
    </div>
</header>

<!-- Contenido Principal -->
<div class="container mt-5">
    <h2 class="text-center mb-4">Tareas Diarias</h2>
    <div class="row">
        <!-- Tarea 1: Registrar Visitantes -->
        <div class="col-md-4">
            <div class="card">
                <img height="250px" width="250px" src="/bddepartamentos-web/resources/img/visitas.png" class="card-img-top" alt="Registrar Visitantes">
                <div class="card-body">
                    <h5 class="card-title">Registrar Visitantes</h5>
                    <p class="card-text">Controla el ingreso de visitantes al conjunto residencial.</p>
                    <a href="/bddepartamentos-web/visitas/findAll?idVisita=1" class="btn btn-primary">Ir al Registro</a>
                </div>
            </div>
        </div>
        <!-- Tarea 2: Supervisar Cámaras -->
        <div class="col-md-4">
            <div class="card">
                <img src="/bddepartamentos-web/resources/img/camaras.jpg" class="card-img-top" alt="Supervisar Cámaras">
                <div class="card-body">
                    <h5 class="card-title">Supervisar Cámaras</h5>
                    <p class="card-text">Monitorea las cámaras de seguridad en tiempo real.</p>
                    <a href="#" class="btn btn-primary">Ver Cámaras</a>
                </div>
            </div>
        </div>
        <!-- Tarea 3: Generar Reportes -->
        <div class="col-md-4">
            <div class="card">
                <img height="250px" width="250px" src="/bddepartamentos-web/resources/img/reportes.jpg" class="card-img-top" alt="Generar Reportes">
                <div class="card-body">
                    <h5 class="card-title">Generar Reportes</h5>
                    <p class="card-text">Crea informes diarios sobre incidentes y actividades.</p>
                    <a href="#" class="btn btn-primary">Generar Reporte</a>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap JavaScript (Al final del body) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" 
        integrity="sha384-rZyXWXF2ckF4oOTElp00WcT2HU7FoszWkLrZOluHFPOTxvI5kciWORqlszH5Js4F" 
        crossorigin="anonymous"></script>

</body>
    <footer class="bg-dark text-white text-center p-3 mt-5">
        &copy; 2025 Alejandro Imbaquingo - Todos los derechos reservados
    </footer>
</html>

