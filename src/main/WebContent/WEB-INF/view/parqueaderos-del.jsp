<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Borrar Parqueadero</title>
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" 
          rel="stylesheet" 
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" 
          crossorigin="anonymous">
                        <link rel="icon" href="/bddepartamentos-web/resources/img/logo.png">
</head><!-- Cargar SweetAlert2 -->
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
<script>
document.addEventListener("DOMContentLoaded", function() {
    Swal.fire({
        title: "¿Estás seguro?",
        text: "¡No podrás revertir esto!",
        icon: "warning",
        showCancelButton: true,
        confirmButtonColor: "#3085d6",
        cancelButtonColor: "#d33",
        confirmButtonText: "Sí, eliminar",
        cancelButtonText: "Cancelar"
    }).then((result) => {
        if (result.isConfirmed) {
            // Realizar la petición AJAX para eliminar el administrador
            fetch(`/bddepartamentos-web/parqueaderos/del?idParqueadero=${parqueadero.idParqueadero}`, {
                method: "GET"
            })
            .then(response => response.text())
            .then(data => {
                if (data.includes("errorMessage")) {
                    // Si hay un error, mostrar la alerta de error
                    Swal.fire({
                        title: "Error",
                        text: "No se puede eliminar el parqueadero porque tiene relación en otras tablas.",
                        icon: "error"
                    }).then(() => {
                        window.location.href = "/bddepartamentos-web/parqueaderos/findAll";
                    });
                } else {
                    // Si se elimina correctamente, mostrar éxito
                    Swal.fire({
                        title: "Eliminado",
                        text: "El administrador ha sido eliminado correctamente.",
                        icon: "success"
                    }).then(() => {
                        window.location.href = "/bddepartamentos-web/parqueaderos/findAll";
                    });
                }
            })
            .catch(error => {
                Swal.fire({
                    title: "Error",
                    text: "Hubo un problema al procesar la solicitud.",
                    icon: "error"
                }).then(() => {
                    window.location.href = "/bddepartamentos-web/parqueaderos/findAll";
                });
            });
        } else {
            // Redirigir si cancela
            window.location.href = "/bddepartamentos-web/parqueaderos/findAll";
        }
    });
});
</script>

</body>
</html>