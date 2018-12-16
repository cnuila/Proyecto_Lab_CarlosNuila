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
public class Reina extends Pieza {

    public Reina(int jugador) {
        super(jugador);
    }

    @Override
    public boolean movimiento(JButton posActual, JButton posDestino, String[][] tablero, int jugador) {
        int posActualFila = coordenada("fila", posActual);
        int posActualColum = coordenada("col", posActual);
        int posDestinFilas = coordenada("fila", posDestino);
        int posDestinCol = coordenada("col", posDestino);
        int diferenciaFila = posActualFila - posDestinFilas;
        int diferenciaColum = posActualColum - posActualColum;
        int sePuede = 0;
        int inicio;
        int fin;
        if (diferenciaFila == 0) {
            if (posActualColum > posDestinCol) {
                inicio = posDestinCol;
                fin = posActualColum;
            } else {
                inicio = posActualColum;
                fin = posDestinCol;
            }
            sePuede = revisarCamino(inicio, fin, tablero, sePuede, posActualFila);
        }
        if (diferenciaColum == 0) {
            if (posActualFila > posDestinFilas) {
                inicio = posActualFila;
                fin = posDestinFilas;
            } else {
                inicio = posDestinFilas;
                fin = posActualFila;
            }
            sePuede = revisarCamino(inicio, fin, tablero, sePuede, posActualColum);
        }
        if (Math.abs(diferenciaColum) == Math.abs(diferenciaFila)){
            
        }
        if (sePuede == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int revisarCamino(int inicio, int fin, String[][] tablero, int sePuede, int iterar) {
        for (int i = inicio; i < fin; i++) {
            if (!tablero[iterar][i].equals(" ")) {
                return 1;
            }
        }
        return 0;
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
