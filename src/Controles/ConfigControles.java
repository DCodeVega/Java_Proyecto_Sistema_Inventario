package Controles;
import Vistas.Sistema;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class ConfigControles implements MouseListener{

    private Sistema vistas;

    public ConfigControles(Sistema vistas) {
        this.vistas=vistas;
        this.vistas.JLabelNuevaVenta.addMouseListener(this);
        this.vistas.JLabelNuevaCompra.addMouseListener(this);
        this.vistas.JLabelProductos.addMouseListener(this);
        this.vistas.JLabelVentas.addMouseListener(this);
        this.vistas.JLabelClientes.addMouseListener(this);
        this.vistas.JLabelConfig.addMouseListener(this);
        this.vistas.JLabelReporteVentas.addMouseListener(this);
        
    }
    
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == vistas.JLabelNuevaVenta) {
            vistas.JPanelNuevaVenta.setBackground(new Color(0,153,153));
        }else if(e.getSource() == vistas.JLabelNuevaCompra){
            vistas.JPanelProveedor.setBackground(new Color(0,153,153));
        }else if(e.getSource() == vistas.JLabelProductos){
            vistas.JPanelProductos.setBackground(new Color(0,153,153));
        }else if(e.getSource() == vistas.JLabelVentas){
            vistas.JPanelVentas.setBackground(new Color(0,153,153));
        }else if(e.getSource() == vistas.JLabelClientes){
            vistas.JPanelClientes.setBackground(new Color(0,153,153));
        }else if(e.getSource() == vistas.JLabelConfig){
            vistas.JPanelConfiguraciones1.setBackground(new Color(0,153,153));
        }else if(e.getSource() == vistas.JLabelReporteVentas){
            vistas.JPanelReporteVentas.setBackground(new Color(0,153,153));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == vistas.JLabelNuevaVenta) {
            vistas.JPanelNuevaVenta.setBackground(new Color(0,102,102));
        }else if(e.getSource() == vistas.JLabelNuevaCompra){
            vistas.JPanelProveedor.setBackground(new Color(0,102,102));
        }else if(e.getSource() == vistas.JLabelProductos){
            vistas.JPanelProductos.setBackground(new Color(0,102,102));
        }else if(e.getSource() == vistas.JLabelVentas){
            vistas.JPanelVentas.setBackground(new Color(0,102,102));
        }else if(e.getSource() == vistas.JLabelClientes){
            vistas.JPanelClientes.setBackground(new Color(0,102,102));
        }else if(e.getSource() == vistas.JLabelConfig){
            vistas.JPanelConfiguraciones1.setBackground(new Color(0,102,102));
        }else if(e.getSource() == vistas.JLabelReporteVentas){
            vistas.JPanelReporteVentas.setBackground(new Color(0,102,102));
        }
    }
    
}
