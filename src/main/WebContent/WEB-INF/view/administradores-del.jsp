<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Eliminar Administrador</title>
<!-- Cargar SweetAlert2 -->
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
            fetch(`/bddepartamentos-web/administradores/del?idAdministrador=${administrador.idAdministrador}`, {
                method: "GET"
            })
            .then(response => response.text())
            .then(data => {
                if (data.includes("errorMessage")) {
                    // Si hay un error, mostrar la alerta de error
                    Swal.fire({
                        title: "Error",
                        text: "No se puede eliminar el administrador porque tiene relación en otras tablas.",
                        icon: "error"
                    }).then(() => {
                        window.location.href = "/bddepartamentos-web/administradores/findAll";
                    });
                } else {
                    // Si se elimina correctamente, mostrar éxito
                    Swal.fire({
                        title: "Eliminado",
                        text: "El administrador ha sido eliminado correctamente.",
                        icon: "success"
                    }).then(() => {
                        window.location.href = "/bddepartamentos-web/administradores/findAll";
                    });
                }
            })
            .catch(error => {
                Swal.fire({
                    title: "Error",
                    text: "Hubo un problema al procesar la solicitud.",
                    icon: "error"
                }).then(() => {
                    window.location.href = "/bddepartamentos-web/administradores/findAll";
                });
            });
        } else {
            // Redirigir si cancela
            window.location.href = "/bddepartamentos-web/administradores/findAll";
        }
    });
});
</script>

</body>
</html>
