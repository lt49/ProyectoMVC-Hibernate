<%-- 
    Document   : login
    Created on : 08/09/2016, 09:01:24 AM
    Author     : Emmanuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Validar Credenciales</h1>
        
        
        <form action="validar" method="POST">            
            Usuario: <input type="text" name="usuario"><br>
            Clave: <input type="password" name="clave"><br>
            <input type="submit" value="Ingresar">
        </form>
    </body>
</html>
