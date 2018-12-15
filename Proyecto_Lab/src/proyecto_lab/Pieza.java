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
public abstract class Pieza {

    protected ImageIcon imagen;
    protected int jugador;

    public Pieza() {
    }

    public Pieza(int jugador) {
        this.jugador = jugador;
        setImagen(jugador);
    }

    public int getJugador() {
        return jugador;
    }

    public void setJugador(int jugador) {
        this.jugador = jugador;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public abstract boolean movimiento();
    public abstract void setImagen(int jugador);

}
