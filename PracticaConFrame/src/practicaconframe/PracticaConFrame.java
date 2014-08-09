/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaconframe;

import java.util.Scanner;
import practicaconframe.Listas.ListaEquipo;
import practicaconframe.Listas.ListaJugador;

/**
 *
 * @author Estudiante
 */
public class PracticaConFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        ListaJugador alemania = new ListaJugador();
        alemania.Insertar("Klose", 36);
        alemania.Insertar("Luka", 26);
        alemania.Insertar("Reus", 23);
        alemania.Insertar("Duarte", 25);

        ListaJugador costaRica = new ListaJugador();
        costaRica.Insertar("Campbell", 21);
        costaRica.Insertar("Ruiz", 27);
        costaRica.Insertar("Navas", 26);
        costaRica.Insertar("Duarte", 25);
        costaRica.Insertar("Bolaños", 30);
        costaRica.EliminarJugador("Duarte");

        ListaJugador honduras = new ListaJugador();
        honduras.Insertar("Paco", 29);
        honduras.Insertar("Lola", 21);
        honduras.Insertar("Duarte", 25);
        honduras.Insertar("Chico", 24);

        ListaJugador francia = new ListaJugador();
        francia.Insertar("Zidane", 25);
        francia.Insertar("Ribery", 21);
        francia.Insertar("Duarte", 22);
        francia.Insertar("Sissoko", 29);

        ListaEquipo equipos = new ListaEquipo();
        equipos.Insertar("Francia", francia);
        equipos.Insertar("Alemania", alemania);
        equipos.Insertar("Honduras", honduras);
        equipos.Insertar("Costa Rica", costaRica);

        equipos.Imprimir();
        

    }

}
