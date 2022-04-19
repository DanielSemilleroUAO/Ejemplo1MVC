<%-- 
    Document   : despliegueVariables
    Created on : 19/04/2022, 12:51:48 p. m.
    Author     : adseglocdom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Despliegue de Variables</title>
    </head>
    <body>
        <h1>Despliegue de Variables</h1>
        Variablee en alcance request: ${mensaje}
        <br/>
        <br/>
        Variable en alcance de sesion:
        <br/>
        Rectangulo:
        <br/>
        Base: ${rectangulo.base}
        <br/>
        Altura: ${rectangulo.altura}
        <br/>
        Area: ${rectangulo.area}
        <br/>
        <br/>
        <a href="${pageContext.request.contextPath}/index.jsp">Regresar al inicio</a>

    </body>
</html>
