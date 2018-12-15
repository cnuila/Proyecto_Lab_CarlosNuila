/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_lab;

import javax.swing.ImageIcon;

/**
 *
 * @author Carlos Nuila
 */
public class Peon extends Pieza {

    public Peon(int jugador) {
        super(jugador);
    }

    @Override
    public boolean movimiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void setImagen(int jugador) {
        if (jugador == 1) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/peonBB.png"));
        } else {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/peonNN.png"));
        }
    }
    
    
    
}
