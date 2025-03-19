<%@page import="pool.ConnectionPool"%>
<%@page import="socios.Socio"%>
<%@page import="socios.GestorSocios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%
            String url = "jdbc:mariadb://localhost:3306/baloncesto";
            String usuario = "root";
            String contraseña ="";
            ConnectionPool newConnectionPool = new ConnectionPool(url, usuario, contraseña);
            GestorSocios miGestor = new GestorSocios(newConnectionPool.getConnection());
            
            // TODO: Establecer la codificación de caracteres de la petición a UTF-8
             request.setCharacterEncoding("UTF-8");
              int idABorrar = Integer.parseInt(request.getParameter("socioID"));
            // TODO: Realizar borrado a través del gestor (try-catch) y comprobar resultado (si verdadero, mostrar mensaje de éxito)
            
           try{
                miGestor.delete(idABorrar); 
                out.print ("Borrado con exito");
            }catch(Exception e){
                out.print(e);
            }
            // TODO: Cerrar las conexiones del pool                  
            newConnectionPool.closeAll();
        %>
        <script>document.location = "index.jsp"</script> 
    </body>
</html>
