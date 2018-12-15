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
public class Reina extends Pieza {

    public Reina(int jugador) {
        super(jugador);
    }

    @Override
    public boolean movimiento() {
        return true;
    }

    @Override
    public void setImagen(int jugador) {
        if (jugador == 1) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/reinaBB.png"));
        } else {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/reinaNN.png"));
        }
    }
    
}
