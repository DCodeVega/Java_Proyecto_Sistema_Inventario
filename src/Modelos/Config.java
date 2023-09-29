package Modelos;

/**
 *
 * @author USUARIO
 */
public class Config {
    private int id;
    private int telefono;
    private String ruc;
    private String nombre;
    private String direccion;
    private String razon;
    
    public Config(){
        
    }

    public Config(int id, int telefono, String ruc, String nombre, String direccion, String razon) {
        this.id = id;
        this.telefono = telefono;
        this.ruc = ruc;
        this.nombre = nombre;
        this.direccion = direccion;
        this.razon = razon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }
    
    
}
