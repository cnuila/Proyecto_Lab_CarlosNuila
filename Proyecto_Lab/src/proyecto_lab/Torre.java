/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_lab;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Carlos Nuila
 */
public class Torre extends Pieza {

    public Torre(int jugador) {
        super(jugador);
    }

    @Override
    public boolean movimiento(JButton posActual, JButton posDestino, String[][] tablero, int jugador) {
       return true;
    }

    

    @Override
    public void setImagen(int jugador) {
         if (jugador == 1) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/torreBB.png"));
        } else {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/torreNN.png"));
        }
    }
    
}
