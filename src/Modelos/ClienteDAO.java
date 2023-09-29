package Modelos;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego Vega
 */
public class ClienteDAO {
    
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    // Conexion con MYSQL:
    public boolean RegistrarCliente(Cliente cl){
        String sql= "INSERT INTO clientes (ci,razon) VALUES (?,?)";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cl.getCi());
            ps.setString(2, cl.getRazon());
            ps.execute();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }finally{
            try{
                con.close();
                
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        }
    }
    
    // Listar en el Table:
    public List ListarCliente(){
        List<Cliente> ListaCl=new ArrayList();
        String sql = "SELECT * FROM clientes";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Cliente cl=new Cliente();
                cl.setId(rs.getInt("id"));
                cl.setCi(rs.getInt("Ci"));
                cl.setRazon(rs.getString("Razon"));
                ListaCl.add(cl);
            }
        }catch (SQLException e){
            System.out.println(e.toString());
        }
        return ListaCl;
    }
    
    // Eliminar Cliente:
    public boolean EliminarCliente(int id){
        String sql="DELETE FROM clientes WHERE id = ?";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException ex){
                System.out.println(ex.toString());
            }
        }
    }
    
    // Modificar Cliente:
    public boolean ModificarCliente(Cliente cl){
        String sql = "UPDATE clientes SET ci=?, razon=? WHERE id=?";
        try{
            ps=con.prepareStatement(sql);
            ps.setInt(1, cl.getCi());
            ps.setString(2, cl.getRazon());
            ps.setInt(3, cl.getId());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        }
    }
    
    public Cliente Buscarcliente(int ci){
        Cliente cl = new Cliente();
        String sql = "SELECT * FROM clientes WHERE ci =?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ci);
            rs = ps.executeQuery();
            if (rs.next()) {
                cl.setRazon("razon");
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return cl;
    }
}
