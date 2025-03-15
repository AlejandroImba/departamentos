<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
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
            fetch(`/bddepartamentos-web/inquilinos/del?idInquilino=${inquilino.idInquilino}`, {
                method: "GET"
            })
            .then(response => response.text())
            .then(data => {
                    // Si se elimina correctamente, mostrar éxito
                    Swal.fire({
                        title: "Eliminado",
                        text: "El Inquilino ha sido eliminado correctamente.",
                        icon: "success"
                    }).then(() => {
                        window.location.href = "/bddepartamentos-web/inquilinos/findAll";
                    });
                
            })
);
        } else {
            // Redirigir si cancela
            window.location.href = "/bddepartamentos-web/inquilinos/findAll";
        }
    });
});
</script>

</body>
</html>