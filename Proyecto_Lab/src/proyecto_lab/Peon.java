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
public class Peon extends Pieza {

    public Peon(int jugador) {
        super(jugador);
    }

    @Override
    public boolean movimiento(JButton posActual, JButton posDestino,String[][] tablero, int jugador) {
        int posActualFila = coordenada("fila", posActual);
        int posActualColum = coordenada("col", posActual);
        int posDestinFilas = coordenada("fila", posDestino);
        int posDestinCol = coordenada("col", posDestino);
        if (tablero[posDestinFilas][posDestinCol].equals(" ")){
            if (jugador == 1){
                return ((posActualColum == posDestinCol) && (posActualFila - 1 == posDestinFilas) || (posActualFila == 6 && posActualFila - 2 == posDestinFilas));
            } else{
                return ((posActualColum == posDestinCol) && (posActualFila + 1 == posDestinFilas) || (posActualFila == 1 && posActualFila + 2 == posDestinFilas));
            }
        } else{
            if (jugador == 1){
                return ((posActualColum - 1 == posDestinCol) && (posActualFila - 1 == posDestinFilas) || (posActualFila + 1 == posDestinFilas));
            } else {
                return ((posActualColum + 1 == posDestinCol) && (posActualFila + 1 == posDestinFilas) || (posActualFila - 1 == posDestinFilas));
            }
        }
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
