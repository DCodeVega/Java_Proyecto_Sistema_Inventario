package Modelos;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Diego Vega
 */
public class Conexion {
    Connection con;
    
    public Connection getConnection(){
        try{
            String myBD = "jdbc:mysql://localhost:33065/sistemaventa?serverTimezone=UTC";//jdbc:myaql://localhost:33065/sistemaventa?serverTimezone=UTC
            con = DriverManager.getConnection(myBD, "root", "");
            return con;
        }catch (Exception e){
            System.out.println(e.toString());
        }
        return null;
    }
}
