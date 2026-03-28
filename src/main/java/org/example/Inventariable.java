package org.example;

/**
 * Interfaz para los objetos que pueden ser almacenados en un inventario.
 * * @author Diego Dario Figueroa Mejia
 */
public interface Inventariable {
    /**
     * Registra el elemento al momento de ser añadido al inventario.
     */
    void registrar();

    /**
     * Borra o elimina el elemento al momento de ser sacado del inventario.
     */
    void borrar();
}