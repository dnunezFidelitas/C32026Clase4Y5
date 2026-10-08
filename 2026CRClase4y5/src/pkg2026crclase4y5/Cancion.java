/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2026crclase4y5;

import javax.swing.JOptionPane;

/**
 * Esta clase es para guarda cualquier cancioon
 * @author viti
 */
public class Cancion {
    public String nombre;
    private int duracionSegundos;
    public ArtistaBanda artistaBanda;
    public Disco disco1;
    private Disco disco2;
    private Disco disco3;
    private Disco disco4;
    private Disco disco5;
    
    /**
     * Este metodo para la musica
     */
    public void stopCancion(){
        JOptionPane.showMessageDialog(null , "Parame la MUSICA");
    }
    
    /**
     * Este metedo da play a la musca
     * @return El deuvuelve la cancio que reproducir
     */
    public String playCancion(){
        JOptionPane.showMessageDialog(null, "Play canción "+ this.nombre);
        return this.nombre;
    }
    
    /**
     * Este metodo adelanta n cantidad de canciones
     * @param cantidadCanciones esta es la cantidad de canciones arriba de 1 y maximo tatp
     */
    public void siguientesCanciones(int cantidadCanciones){
          JOptionPane.showMessageDialog(null, "Adelante " + cantidadCanciones + " canciones");
    
    }
    
    
    
    
}
