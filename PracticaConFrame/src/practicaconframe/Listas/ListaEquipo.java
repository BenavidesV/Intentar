/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaconframe.Listas;

import Nodos.NodoEquipo;
import Nodos.NodoJugador;

/**
 *
 * @author Jimenez
 */
public class ListaEquipo {

    private NodoEquipo raiz;

    public void Insertar(String nombre, ListaJugador jugadores) {
        NodoEquipo nuevo;
        NodoEquipo temp;
        nuevo = new NodoEquipo();
        nuevo.setNombre(nombre);
        nuevo.setJugadores(jugadores.getListaJugadores());
        if (raiz == null) {
            raiz = nuevo;
        } else {
            if ((nuevo.getNombre().compareTo(raiz.getNombre()) < 0)) {
                nuevo.setSiguienteEquipo(raiz);
                raiz = nuevo;
            } else {
                NodoEquipo recorre = raiz;
                NodoEquipo atras = raiz;

                while (((nuevo.getNombre().compareTo(recorre.getNombre())) >= 0) && recorre.getSiguienteEquipo() != null) {
                    atras = recorre;
                    recorre = recorre.getSiguienteEquipo();

                }
                if (nuevo.getNombre().compareTo(recorre.getNombre()) > 0) {
                    recorre.setSiguienteEquipo(nuevo);
                } else {
                    nuevo.setSiguienteEquipo(recorre);
                    atras.setSiguienteEquipo(nuevo);
                }

            }
        }
    }

    public void Imprimir() {
        NodoEquipo recorridoEquipo = raiz;

        System.out.println("Listado de todos los elementos de la lista");
        while (recorridoEquipo != null) {
            System.out.println(recorridoEquipo.getNombre());
            NodoJugador recorridoJugadores = recorridoEquipo.getJugadores();

            while (recorridoJugadores != null) {
                System.out.println(recorridoJugadores.getNombre() + " " + recorridoJugadores.getEdad());
                recorridoJugadores = recorridoJugadores.getSiguienteJugador();
            }
            recorridoEquipo = recorridoEquipo.getSiguienteEquipo();
        }

    }

    public boolean EstaVacia() {
        return raiz == null;
    }
}
