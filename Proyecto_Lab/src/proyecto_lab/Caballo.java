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
public class Caballo extends Pieza {

    public Caballo(int jugador) {
        super(jugador);
    }

    @Override
    public boolean movimiento(JButton posActual, JButton posDestino, String[][] tablero, int jugador) {
        int posActualFila = coordenada("fila", posActual);
        int posActualColum = coordenada("col", posActual);
        int posDestinFilas = coordenada("fila", posDestino);
        int posDestinCol = coordenada("col", posDestino);
        return (((posDestinCol == posActualColum + 2) && (posDestinFilas == posActualFila + 1))
                || ((posDestinCol == posActualColum + 2) && (posDestinFilas == posActualFila - 1))
                || ((posDestinCol == posActualColum - 2) && (posDestinFilas == posActualFila + 1))
                || ((posDestinCol == posActualColum - 2) && (posDestinFilas == posActualFila - 1))
                || ((posDestinCol == posActualColum + 1) && (posDestinFilas == posActualFila + 2))
                || ((posDestinCol == posActualColum - 1) && (posDestinFilas == posActualFila + 2))
                || ((posDestinCol == posActualColum + 1) && (posDestinFilas == posActualFila - 2))
                || ((posDestinCol == posActualColum - 1) && (posDestinFilas == posActualFila - 2)));
    }

    @Override
    public void setImagen(int jugador) {
        if (jugador == 1) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/caballoBB.png"));
        } else {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/caballoNN.png"));
        }
    }

}
