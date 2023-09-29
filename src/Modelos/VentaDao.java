
package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author Diego Vega
 */
public class VentaDao {
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    int r;
    ResultSet rs;
    
    public int IdVenta(){
        int id = 0;
        String sql = "SELECT MAX(id) FROM ventas";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return id;
    }
    
    // Registrar Ventas 
    public int RegistrarVenta(Venta v){
        String sql = "INSERT INTO ventas (cliente, vendedor , total, fecha) VALUES(?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, v.getCliente());
            ps.setString(2, v.getVendedor());
            ps.setDouble(3, v.getTotal());
            ps.setString(4, v.getFecha());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return r;
    }
    
    // Consulta para el JcomboBox de Marcas
    public void ConsultarMarca(JComboBox productos){
        String sql = "SELECT marca FROM productos";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                productos.addItem(rs.getString("marca"));
                
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    // Consulta para el JcomboBox de Colores
    public void ConsultarColor(JComboBox productos){
        String sql = "SELECT color FROM productos";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                productos.addItem(rs.getString("color"));
                
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    // Consulta para el JcomboBox de Tamaños
    public void ConsultarTamaño(JComboBox productos){
        String sql = "SELECT tamaño FROM productos";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                productos.addItem(rs.getString("tamaño"));
                
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    // Detalle de Ventas
    public int RegistrarDetalle(Detalle Dv){
        String sql = "INSERT INTO detalle (codigo_prod, cantidad, precio, id_venta) VALUES (?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Dv.getCodigo_prod());
            ps.setInt(2, Dv.getCantidad());
            ps.setDouble(3, Dv.getPrecio());
            ps.setInt(4, Dv.getId());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return r;
    }
    
    // Actualizar Stock
    public boolean ActualizarStock(int cant, String cod){
        String sql = "UPDATE productos SET stock = ? WHERE codigo = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cant);
            ps.setString(2, cod);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    // Listar Historial de Ventas:
    public List ListarVentas(){
        List<Venta> ListaVenta=new ArrayList();
        String sql = "SELECT * FROM ventas";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Venta vent=new Venta();
                vent.setId(rs.getInt("id"));
                vent.setCliente(rs.getString("cliente"));
                vent.setVendedor(rs.getString("vendedor"));
                vent.setTotal(rs.getDouble("total"));
                vent.setFecha(rs.getString("fecha"));
                ListaVenta.add(vent);
            }
        }catch (SQLException e){
            System.out.println(e.toString());
        }
        return ListaVenta;
    }
}
