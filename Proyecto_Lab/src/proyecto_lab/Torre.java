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
        int posActualFila = coordenada("fila", posActual);
        int posActualColum = coordenada("col", posActual);
        int posDestinFilas = coordenada("fila", posDestino);
        int posDestinCol = coordenada("col", posDestino);
        int inicio = 0;
        int fin = 0;
        int sePuede = 0;
        if (posActualFila == posDestinFilas){
            if (posActualColum > posDestinCol){
                inicio = posActualColum;
                fin = posDestinCol;
            } else{
                fin = posActualColum;
                inicio = posDestinCol;
            }
            for (int i = inicio; i < fin; i++) {
                if (!tablero[posActualFila][i].equals(" ")){
                    sePuede = 1;
                    i = fin;
                }
            }
        }
        if (posActualColum == posDestinCol){
            if (posActualFila > posDestinFilas){
                inicio = posActualFila;
                fin = posDestinFilas;
            } else{
                fin = posActualFila;
                inicio = posDestinFilas;
            }
            for (int i = inicio; i < fin; i++) {
                if (!tablero[posActualFila][i].equals(" ")){
                    sePuede = 1;
                    i = fin;
                }
            }
        }
        if (sePuede == 0){
            return true;
        } else {
            return false;
        }
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
