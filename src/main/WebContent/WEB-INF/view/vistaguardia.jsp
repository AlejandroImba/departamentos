<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" 
          rel="stylesheet" 
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" 
          crossorigin="anonymous">
          <style>
        .hero {
            background: url('https://source.unsplash.com/1600x900/?apartment') center/cover;
            height: 400px;
            display: flex;
            align-items: center;
            justify-content: center;
            color: black;
            text-align: center;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg bg-body-tertiary">
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
          <a class="nav-link" aria-current="page" href="/bddepartamentos-web/visitas/findAll?idVisita=1">Gestion de Visitas</a>
        </li>
      </ul>
      <!-- Botón de Iniciar sesión como Admin alineado a la derecha -->
      <div class="d-flex">
        <a href="/bddepartamentos-web/" class="btn btn-outline-primary">Salir del modo Guardia</a>
      </div>
    </div>
  </div>
</nav>
<header class="hero">
        <div>
            <h1>Encuentra tu nuevo hogar</h1>
            <p>Departamentos modernos con las mejores comodidades</p>
            <a href="#" class="btn btn-primary">Ver más</a>
        </div>
    </header>
    
    <div class="container mt-5">
        <h2 class="text-center">Nuestros Departamentos</h2>
        <div class="row">
            <div class="col-md-4">
                <div class="card">
                    <img src="/bddepartamentos-web/resources/img/departamento1.png" class="card-img-top" alt="Depto 1">
                    <div class="card-body">
                        <h5 class="card-title">Departamento 1</h5>
                        <p class="card-text">Amplio y moderno, con vistas espectaculares.</p>
                        <a href="#" class="btn btn-primary">Ver más</a>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card">
                    <img src="/bddepartamentos-web/resources/img/departamento2.jpg" class="card-img-top" alt="Depto 2">
                    <div class="card-body">
                        <h5 class="card-title">Departamento 2</h5>
                        <p class="card-text">Ubicado en el centro de la ciudad, con todas las comodidades.</p>
                        <a href="#" class="btn btn-primary">Ver más</a>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card">
                    <img src="/bddepartamentos-web/resources/img/departamento3.jpg" class="card-img-top" alt="Depto 3">
                    <div class="card-body">
                        <h5 class="card-title">Departamento 3</h5>
                        <p class="card-text">Diseño vanguardista con acabados de lujo.</p>
                        <a href="#" class="btn btn-primary">Ver más</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <footer class="bg-dark text-white text-center p-3 mt-5">
        &copy; 2025 Departamentos Alejandro Imbaquingo - Todos los derechos reservados
    </footer>
    
<!-- Bootstrap JavaScript (Al final del body) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" 
        integrity="sha384-rZyXWXF2ckF4oOTElp00WcT2HU7FoszWkLrZOluHFPOTxvI5kciWORqlszH5Js4F" 
        crossorigin="anonymous"></script>

</body>
</html>


