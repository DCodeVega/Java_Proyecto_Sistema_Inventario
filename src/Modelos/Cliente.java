package Modelos;

/**
 *
 * @author USUARIO
 */
public class Cliente {
    private int id;
    private int ci;
    private String razon;

    public Cliente() {
    }

    public Cliente(int id, int ci, String razon) {
        this.id = id;
        this.ci = ci;
        this.razon = razon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }
    
    
}
