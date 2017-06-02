<%-- 
    Document   : index
    Created on : 25/08/2016, 08:08:07 AM
    Author     : Emmanuel
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="upeu.model.entity.AlumnoDTO"%>
<jsp:useBean id="lista" scope="request" type="java.util.List" />
<jsp:useBean id="usuario" scope="session" class="java.lang.String" />

<%
  if(usuario.equals("")){
      response.sendRedirect(request.getContextPath());
  }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>Usuario: <%= usuario %></p>
        <br><br>
        <a href="cerrar">Cerrar Sesión</a>
        <h1>CRUD MVC Servlet</h1>
        
        <form action="op" method="POST">
            <table>
                <tr>
                    <td>Nombres</td>
                    <td><input type="text" name="nombres"/></td>
                </tr>
                <tr>
                    <td>Apellidos</td>
                    <td><input type="text" name="apellidos"/></td>
                </tr>
                <tr>
                    <td>Codigo</td>
                    <td><input type="text" name="codigo"/></td>
                <input type="hidden" name="operacion" value="add"/>
                </tr>
                <tr>
                    <td colspan="1"><input type="submit" value="Guardar"></td>
                </tr>
            </table>
        </form>
        
        <form method="" action="">
            <table>
                <tr>
                    <td>#</td>
                    <td>Nombres</td>
                    <td>Apellidos</td>
                    <td>Acción</td>
                </tr>
                <%                 
                 int count = 0;
                 for(AlumnoDTO adto: (List<AlumnoDTO>)lista){ 
                     count++;
                %>
                <tr>
                    <td><%=count%></td>
                    <td><%=adto.getNombres()%></td>
                    <td><%=adto.getApellidos()%></td>
                    <td>[<a href="op?idalumno=<%=adto.getIdalumno()%>&operacion=find">Editar</a>] | [<a href="op?idalumno=<%=adto.getIdalumno()%>&operacion=delete">Eliminar</a>]</td>
                </tr>
                <%
                 }
                %>
            </table>
        </form>
        
        
    </body>
</html>
