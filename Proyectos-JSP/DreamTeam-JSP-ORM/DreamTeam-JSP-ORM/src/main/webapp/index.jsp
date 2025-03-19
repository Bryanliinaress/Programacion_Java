<%@page import="java.util.ArrayList"%>
<%@page import="pool.ConnectionPool"%>
<%@page import="socios.Socio"%>
<%@page import="socios.GestorSocios"%>%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <!-- Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

        <title>DreamTeam - JSP - ORM</title>
    </head>

    <body>  
        <div class="container">
            <br><br>			
            <div class="panel panel-primary">
                <div class="panel-heading text-center"><h2>Club de Baloncesto</h2></div>
                <%
                   String url = "jdbc:mariadb://localhost:3306/baloncesto";
                String usuario = "root";
                String contraseña ="";
                ConnectionPool newConnectionPool = new ConnectionPool(url, usuario, contraseña);
                GestorSocios miGestor = new GestorSocios(newConnectionPool.getConnection());
                
                
                ArrayList<Socio> arraySocios = null ;
                
                try{
                    arraySocios = miGestor.requestAll("nombre") ;
                %>
                <table class="table table-striped">
                    <tr><th>Nº de socio</th><th>Nombre</th><th>Estatura</th><th>Edad</th><th>Localidad</th><th></th><th></th></tr>
                    <form method="get" action="grabaSocio.jsp">
                        <tr><td><input type="text" name="socioID" size="5"></td>
                            <td><input type="text" name="nombre" size="30"></td>
                            <td><input type="text" name="estatura" size="5"></td>
                            <td><input type="text" name="edad" size="5"></td>
                            <td><input type="text" name="localidad" size="20"></td>
                            <td><button type="submit" value="Añadir" class="btn btn-primary"><span class="glyphicon glyphicon-plus"></span> Añadir</button></td><td></td></tr>           
                    </form>
                    <%
                        for(Socio socioAMostrar: arraySocios){
                            String nombreUsuario = socioAMostrar.getNombre();
                            String localidadUsusario = socioAMostrar.getLocalidad();
                            int idUsuario = socioAMostrar.getId();
                            int edadUsuario = socioAMostrar.getEdad();
                            int estaturaUsuario = socioAMostrar.getEstatura();
                            out.print ("<tr>");
                            out.print ("<td>"+idUsuario+"</td>");
                            out.print ("<td>"+nombreUsuario+"</td>");
                            out.print ("<td>"+estaturaUsuario+"</td>");
                            out.print ("<td>"+edadUsuario+"</td>");
                            out.print ("<td>"+localidadUsusario+"</td>");
                        
                    %>
                    <td>
                        <!-- TODO: Introducir los datos de cada socio al formulario asociado al botón modificar.-->
                        <form method="get" action="modificaSocio.jsp">
                            <input type="hidden" name="socioID" value="<%=idUsuario  %>">
                            <input type="hidden" name="nombre" value="<%= nombreUsuario %>">
                            <input type="hidden" name="estatura" value="<%= estaturaUsuario %>">
                            <input type="hidden" name="edad" value="<%= edadUsuario %>">
                            <input type="hidden" name="localidad" value="<%= localidadUsusario %>">
                            <button type="submit" class="btn btn-info"><span class="glyphicon glyphicon-pencil"></span> Modificar</button>
                        </form>
                    </td>
                    <td>
                        <!-- TODO: Introducir el ID de cada socio al formulario asociado al botón eliminar.  -->
                        <form method="get" action="borraSocio.jsp">
                            <input type="hidden" name="socioID" value="<%= idUsuario %>"/>
                            <button type="submit" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span> Eliminar</button>
                        </form>
                    </td></tr>
                    <%
                        // TODO: Cerrar bucle, cerrar else, bloque catch, cerrar conexiones del pool
                        }}
                    catch (Exception e){
                        out.print(e);
                    }
                    newConnectionPool.closeAll();
                    %>

                </table>
            </div>
            <div class="text-center">&copy; DreamTeam - JSP - ORM</div>
        </div>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>