/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_lab;

import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JButton;

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
    
    public int coordenada(String indicador, JButton boton){
        String coordenadas = boton.getName();
        int fila = Integer.parseInt(String.valueOf(coordenadas.charAt(0)));
        int columna = Integer.parseInt(String.valueOf(coordenadas.charAt(2)));
        if (indicador.equalsIgnoreCase("fila")){
            return fila;
        } else{
            return columna;
        }
    }

    public abstract boolean movimiento(JButton posActual, JButton posDestino,String[][] tablero, int jugador);
    public abstract void setImagen(int jugador);

}
