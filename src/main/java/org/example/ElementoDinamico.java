package org.example;

/**
 * Interfaz que define el comportamiento de los elementos que pueden moverse en el juego.
 * * @author Diego Dario Figueroa Mejia
 */
public interface ElementoDinamico {
    /**
     * Mueve el elemento en el mapa basándose en una dirección y una distancia.
     * * @param direccion La dirección del movimiento
     * @param distancia La cantidad de unidades que el elemento se desplazará.
     */
    void mover(String direccion, int distancia);
}