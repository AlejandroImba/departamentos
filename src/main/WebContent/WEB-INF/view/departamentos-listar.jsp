<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Departamentos del Edificio</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
              <link rel="icon" href="/bddepartamentos-web/resources/img/logo.png">
                 <link rel="stylesheet" href="/bddepartamentos-web/resources/css/css.css">
</head>
<body class="container mt-4">
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="/bddepartamentos-web/">CONJUNTOSIMBA</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="nav nav-tabs me-auto">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Edficios-Departamentos</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/bddepartamentos-web/">Inicio</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/bddepartamentos-web/areas/areassociales">Areas Sociales</a>
        </li>

      </ul>
      <!-- Botón de Iniciar sesión como Admin alineado a la derecha -->
      <div class="d-flex">
        <a href="/bddepartamentos-web/login/" class="btn btn-outline-primary">Iniciar sesión como Admin</a>
      </div>
    </div>
  </div>
</nav>
    <table class="table table-bordered table-striped">
        <thead class="table-dark">
            <tr>
                <th>Número de cuartos</th>
                <th>
                Baño
                <br>
<img src="data:image/png;base64,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" alt="toilet-emoj">        
<th>  
Sala
<br>
<img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAC0AAAAtCAYAAAA6GuKaAAAACXBIWXMAAAsTAAALEwEAmpwYAAACoElEQVR4nO3XT0iTYRwH8NWKDl6siJVIx7oEFYlJh1iRFtTBCoI6BCWOgQejOpiH7M9OMjNXB81DNjqEZnufd2N5MAb7977PZkKymCwREcEcmQgdPKy+8bzi2hq2f89eV70/+DJ4D7/n8/6e3+GdTqeVVlr9mwVgUwiOY+xX9zdUCMJhGaKfQoQMMSxBOKor1/LBtV0G6aEQEwy8FhnidwpiH4d7l65cCujYLMN5VQaJp2IzQ75KEFoHMajfULAM1xEKUfozNj0yxHG276pjgxjZwVZh9epzB9MknPxgKyOBGFRcBfFLIViaOfUltjIeeLaUBEwhHKcQP/DA0szJRyWQem7YMQzvYVe5eqX8wTR98s4xiHuLwPZtZVdHQZZLjaXpU/9GQe7F4N6WF1iGcEKGGMl2QDDhxOiyO+8EE84cXoDEKMiZrFiKNzspyFC2ht4VFxrvRlFRswj9gaW8U1GziPMdUfhWcsIPMde6aAlOYy5XeO3xREFY/W9psk3ktDLMVTR634U5Luj9F+fUQ1c3zHNBVzfMa2ikTtYxM4Ln70eTMRgXuEzaYFxI68vO4bYe1rcemLvkZCrr4lzQlXXxtL7sHA1tTpnI7pOfcc4yi8tPZwrO2YezSh/VJm2yT+HJ5MeiY3oxpR76gS/KBX3fO6ke2hLgg7YEouqhO8MRLujOcEQ9dIuNKjF3h9BsDecdc3foVw+10KWK9b9H9wbeod3uV3Kl/RUu3X6JtgFv8lkhaRvwKn1Yv7Vn7BzuX3mvY71gf8pr6w/l9HWWLbWnDir9hj/1le7T9GZPs3LIjUdNXNCtXdeVfrdsptKh7zxrQaPpNBzT/VzQjul+pR/rWzL0RkXS0CiDSfshVMkgpnKLH0LVumittNJKtyH1E7khvK3ZSB7FAAAAAElFTkSuQmCC" alt="interior">
   </th>         
  <th>
  Cocina
  <br>
<img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAACXBIWXMAAAsTAAALEwEAmpwYAAACGElEQVR4nO2XP0/bQByGb4C1Ep+gC0tVoE4FZXKUKIniiIEwlI/AVgkfAymxa6HKF2BFQkL8GVDIgPgI0IYiGip14t8EQ20Upkj1AohCfshS4lQ1BLc5nBy9R3rl32Dp3kd3lm2EOByOJ2SV7GCVwJ+RVX0bsQC+o3w1iAUwqwLvNO2ZrOgr9QSwoq+lUpkO1GqMqaRfVslx3fI1iR+jqi6iVkDTtDZZyYxjVb/yVN6Jfo1VfWpkZL69aeXH0h+fY4V8+bvirnyTNdLpe/lRRR/GCrEaLF85UsTCHzJvfRWQFXJBpXztSJ37KrCQXQfa8VVgdiH7a245B7Qyu7h65asAh8PhtAY9qcOdnolD6J44gK70AbxM78MLZW/7X+/zhaEzGEgW4TRZBKCRwSKYySIkYPfVwE1BOC0XBKCRm6+CCQUh4RKoLAiUY9gL0ipfrkkYLoHqot8v61+95Pd7aZcvV3KvAO08VGRp8g0Eg0EIh8MQjUYhHo9DdkpkR6BMawf6tix4jDAvUPqEPMfMec+9AoHpYxDeHzWUwMxJ8wSEBstXwwVyfAeOfDtCkiQ5z4A9M/cMxGIxR8CemROIRCKOgD0zJxAKhRwBe2ZOQBRFR8CemRMo8RcZekI7EJg5abj862Z8C/VuWSb1r9G8ZZQ2kUlbwFhF7l/K3ryVoCqRt4y+zz+l0gZKeJUwPZY3ckhyCXA4/ym3CQj7aTrALloAAAAASUVORK5CYII=" alt="kitchen-room">      
</th>
<th>
Número de Personas
<br>
<img width="72px" src="/bddepartamentos-web/resources/img/personas.png" alt="personas"></th>
 <th>
Encargado
<br>
<img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAACXBIWXMAAAsTAAALEwEAmpwYAAAG+UlEQVR4nO2Xa0xbZRjHO+MnXQtsPaiJGrNojJps8Yvxg8YPximyeYtsY4XexsVMhpONcRm00AstHRS20XaOy6bb6IYaMwZMR9sVGJeyuTWAojKZu8TJNkeBOqCl/M17Sg+36Siwwoc9yZOennNy8vu9/Z/n9LBYD+pBPagHNbEaRNQqizj0W6uYe90q5g5ZN1E4LaZwWkTBIqRgFlAw8ymYoigHa7GVNfbxMgJsjaFQF0uhLsa77ZMgApYxgdoo6hxrsVRD4orXzmW90j4JPm6ChE9ANC7ww8bHmirXPPHIQrOz6uJCP7HGPO4hgFaxF5jA18ePS0yNkSmawskPKVS/T/1YFR4UsmDwpzdx1ZPgRF7Yib/ApAiJKJgJfASFGq8ATqylahYE3iLivmERU6ME3LeyJB4Wvve7L07kkwbnUzgVSeHkxxROfkSh5gOvQNVaClXhVETgBQRUNQ0tpNBWsAZDN2vgctTir0YNOnQROJO0EhbRU7CInkZTyqv4rTwBjl8Pwe204k5PFZpSXkf1e16BynBubcAFTHyql4zE5pSX4RluBDytfrWrz4xTvBWoWkOh8l3q74ALmKO5TpLn62dy/Yb39cWKZJwIJwKhAwEXMPG43Rbxk57ZrL6vB2+eRNXax1AZFtoVcIFTPG7Thdww12zhfV2/5VX38XdC6wMvEEmVdh3b4pmrQJt+k+f426GlgRfYwN36Z/3s8+/ra5ZdOL46dGtA4YGWF2+c1V1z/HJozgL93d/gemPRNaD5hcAJjNiShm/XwuUwz1nAPWDF0K1TINcMnIC7NWyu4NPabXsncAJo4WDE1jlv8CO2TnLNgAkwIvMkwFqowkjrnbmvfuudhRRongeBpoUUiJq7wNnIhRMAHoLHVj0HgRPkGgsm4JVoCMFI67lZROcscCGYtRgKOBcEj61m5gK26oljUyqVPqzWGuQ5eUXT4kT2KbR75eSc+yyBJTMWAJYwgIV6qapA71IV6JGj1blytLrVzDGtbrUir8ilyCuC93NP5v2V8LTPQKCdmfvqQoNZXWgAgfcKjHW+vk+Zp+9T5usION3yXXuRrdkDqXq3aV6hgwTGZzhCYzqbf8Tk8TgBj/1/4O0g5wTzSmqDI0vSFVp9yzR4rQ4E/G7wWbm7IVUVWOYFnC0uD2cLy+s4wvJRjqAcHMERDA6PAHADo13T4ck+uOlzQjaW0L02ed+oX/DqQkiV+RlzAn+UX76SLTRa2EIjOKTH4DmCw7jUMwCmRvsBz8/eJttjdamnf0ygGELJvknwxQfLYbHWw263o6OjA43NNpQeOsbAS1QFyFDlH501PEd8lLdUaPznbvBB/EOoaOpmQP85fx6X4uLwu0CAgZYWZv+xMxdp+OdE+6HIH4f/+rsTNHh7ezs6OzvR1dWF7u5uXLlyBVXfm7zwOVqkK/PdyTLZc37DLxVV7GSLjuK/4EmHKb5nQG+UlaF91Sq6ewwGZn+MyojYLAMU+YZJK0/gz9vbsNlgxoqECjybUIHPiy3448o19PT0oPRwBXYq85Euz0NqtmYkNSu3Kkmi2jIzeOHRCLbIOPp/8EHRXyEo+kv0OodpUPfNm4wA2SZ12zkEudYwLfMWaz298p8azOAIx64bfRDBvFKklJzGrVu30PZTJw2fJtuFlGwNkqVqbMvMufcfwZC4iqClImPvTOCDow5CW9lGw/bX1zMC/Q0N9L6C43Yo73LDXrDb6diQlZ8IvyxyP56PLYPD4cDt3t4p8Cps3akcnUF0jJKZwgdHHaC7/44LN/bvZwRuFBfDOegCl/fFmMDkadPe0UFnnsRmIvzy9Xq8FFsCp9MJh6NvMnyGEonp8nsLsIXGDn/gg3ll2Kg14XJSEiNweds2iHfXYtmGfZDlTR+Vjc02+oYlmZ8Iz43YA+kBCwYHB/FrV/cUeAUSUmSD9xTgCMqH/IEP4ZXSY9Kk2ccIkG0CT/rNRD3EmTpaRDE258moJNOG3LAk8y/EHcCLMcWQlJnRP+CE2+1G2ZGvGfgt6Qp3QqqscvOO7MSZCPgN75vzP8o1dPvgl28w0Cu7fL0Oz0YXIVsz/pAio5JMG3LDksyT2JCVJ/CmusZx+DS5Oz7ZjzHKFhy5Oht4EoNlkV/cFX75uiJw1xUhKm38CUvmPBmVZNr09jrQ19dPx2biypPYfJoi8+9BxuYfDuPwv7o63/DcdXsR9tme8SdsjpaZ89OmjS/zqTJs3i6RshZLSdSFdX7B78hG/DaplbVYKkNVYJoGn6VBcpa6LylD1TcV/pPtUsQmZZhZi6nSFXmZafI8F4HfkZ07nJapfNN3LDEt+62EVJnLCy9xxW2X3N8XmtkWeV3ckaWRJ0ty1089Fp+aFRmfJPnPV8p/AaLfW8nVMTA/AAAAAElFTkSuQmCC" alt="admin-settings-male--v1"></th>
 <th>
Reservar
<br>
<img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAACXBIWXMAAAsTAAALEwEAmpwYAAADmElEQVR4nO2aS2gUQRCGS+MjSnxiTA6iYvSgeBE8eBNEjY9okt2uyesQT4rPqEcvgZyMejAIPhByyEGD4sEYlRxU9CAiXryYl0iMikiWgHjQJJpfpmeUZLd3tmd20juENBQs7HZNfd3V1VU1SzQzputA7TKCVUEQFwniIYF7CGKYwCOOyM/dznf2b+LlhPKlFImBPfMJoo7AXQT+TWD4FHvOYwLXSl3GB3gBgc8SxJcAxqeTzwRxmlCfbwgivpcg3ocIkCz9BKt0qt2oZQoBkqVN7ny4ENVFBH5jEAKOiNeEypUhQVStdbbbNAT/kz5pQ3YQXOiE0ZxBwN0Z+0wWB4Soz8+NO7GHmwUJ0RDXcm88J8uVACE250ZDLfHdfsJsb+4N5nTSr3dpyhtby2dHCXyKULaQ0DibwLsI4o8hmAad3dBMO8SR1PmiwxDIJ++D7ySAOhDP1fOtUoMuVuPlVl2aSqrU82mWwfP1yKOe0E7F13ssRoMhkDFC3WKVW1ToK/HwT7tYcgKBARjrgGolL/lQUpgepKqEwOOGduWCCqTTh4L9aojDcwniqSEIEPiBCqTPh4I7EUlrelQgCX0F8gysVuh4ZhZEDKlARnwqalecj40E8dMgzC+VWwQwIB5T6DmWYxD+GmBrhwmxNQqYlhy6lngXUOFbwsFFqTd8xnA+kEU/DK50Zxt+k1fG7izmpcndfijmJAixde65KnGiXRDXFh2qHWnKcqtbZTqfordyFUHcmpDijxF4h2IhiwniPEF89/HM5ixTlLTSJi9F1UBsg7yJwUL5/eTfQU/iZQoFvERGgexhnhB4uaexniA1KzTdalSdNIZbGA0o3UcLxNqn+YzOEAorLbETx5vyjPgC4fuaO1LtocRO+vhjiDBw3fUqIb41c5nN1zUhBgk8L9OKHA8ZZKIB9l11jhDf4jQtuMBtyR4l8Acfek5qbK1UjAhLj17HEXwoAsYijYwTrJ2ZIRyQ2xEwGGnksi5Enr+6xKi8ynzA/4NY2yJgMNSvFaqL9CAkiGiMIESvslTI4FovI+hOhT4hfDXoTMiNgC922IqA8XDuCd0QqwZp1fDXIQLfc14n8Bk3OQzrLAzKGzvrf0DIVn3KA74R+C6BTxCszbKEnTRn+xzZFZdZc6DuiV1kdcoEUDu0ZhrgF24Dot3NfTalGO49v8D9U02Tm8F2O/okoN1qSji5liwVmmVRlFzrzwyaPuMvF4auze7yxoIAAAAASUVORK5CYII=" alt="whatsapp--v1">        <tbody>
            <c:forEach var="departamento" items="${departamentos}">
                <tr>
                    <td>${departamento.numCuartos}</td>
                    <td>${departamento.baños}</td>
                    <td>${departamento.sala}</td>
                    <td>${departamento.cocina}</td>
                    <td>${departamento.numPersonas}</td>
                    <td>${departamento.administrador.nombre} ${departamento.administrador.apellido}</td>
                    <td><a id="miEnlace" href="https://w.app/fcgmki" class="btn btn-info" target="_blank" rel="noopener noreferrer">Reservar Ahora</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/bddepartamentos-web/edificios/findAll" class="btn btn-info">Volver a Edificios</a>
</body>
    <footer class="bg-dark text-white text-center p-3 mt-5">
        &copy; 2025 Alejandro Imbaquingo - Todos los derechos reservados
    </footer>
</html>