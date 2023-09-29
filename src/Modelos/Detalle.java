package Modelos;

/**
 *
 * @author USUARIO
 */
public class Detalle {
    private int id;
    private String codigo_prod;
    private int cantidad;
    private double precio;
    private int id_venta;
    
    public Detalle(){
        
    }

    public Detalle(int id, String codigo_prod, int cantidad, double precio, int id_venta) {
        this.id = id;
        this.codigo_prod = codigo_prod;
        this.cantidad = cantidad;
        this.precio = precio;
        this.id_venta = id_venta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo_prod() {
        return codigo_prod;
    }

    public void setCodigo_prod(String codigo_prod) {
        this.codigo_prod = codigo_prod;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }
    
    
}
