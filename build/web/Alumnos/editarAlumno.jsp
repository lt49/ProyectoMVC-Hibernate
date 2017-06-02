<%-- 
    Document   : editarAlumno
    Created on : 09/09/2016, 10:58:55 AM
    Author     : Emmanuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="alumno" scope="request" class="upeu.model.entity.AlumnoDTO" />
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Editar Alumno</h1>
        <form action="op" method="POST">
             <input type="hidden" name="idalumno" value="<%=alumno.getIdalumno()%>"/>
            <table>
                <tr>
                    <td>Nombres</td>
                    <td><input type="text" name="nombres" value="<%=alumno.getNombres()%>"/></td>
                </tr>
                <tr>
                    <td>Apellidos</td>
                    <td><input type="text" name="apellidos" value="<%=alumno.getApellidos()%>"/></td>
                </tr>
                <tr>
                    <td>Codigo</td>
                    <td><input type="text" name="codigo" value="<%=alumno.getCodigo()%>"/></td>
                <input type="hidden" name="operacion" value="edit"/>
               
                </tr>
                <tr>
                    <td colspan="1"><input type="submit" value="Guardar"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
