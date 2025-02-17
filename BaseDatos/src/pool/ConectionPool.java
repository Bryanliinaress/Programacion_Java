package pool; 

import java.sql.DriverManager;
import java.sql.Connection;
import java.util.ArrayList;

public class ConectionPool{
    private ArrayList<Connection> conexion = new ArrayList<Connection>();
    private String url;
    private String user;
    private String password;

    public ConectionPool(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public Connection getConnection() {
        Connection con = null;
        try{
            con = DriverManager.getConnection(this.url, this.user, this.password);

            if(con != null)
                this.conexion.add(con);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return con;
    }

    public  void closeAll(){
        for (Connection con : this.conexion) {
            try {
                if(con != null)
                    con.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        this.conexion.clear();
    }
}
