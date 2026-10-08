/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2026crclase4y5;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cancion dueles = new Cancion();
        dueles.nombre= "Dueles";
        dueles.playCancion();
        ArtistaBanda artistaBanda = new ArtistaBanda();
        artistaBanda.nombre = "Jessy y Joy";
        artistaBanda.genero = "Pop";
        artistaBanda.fechaCreacion =2010;
        dueles.artistaBanda=artistaBanda;
        Cancion cancio2 = new Cancion();
        cancio2.nombre="!Corre!";
        cancio2.artistaBanda=artistaBanda;
        
        // imprime el genero del artistas qeu tiene la canción duele
        JOptionPane.showMessageDialog(null, dueles.artistaBanda.genero);
        
        
        cancio2.siguientesCanciones(2);
        String cualCancionSuena="";
        cualCancionSuena=cancio2.playCancion();
        
        
        JOptionPane.showMessageDialog(null, "AMOO ESTA CANCION "+ cualCancionSuena);
        
    }
    
}
