package org.example;

/**
 * Clase que representa un punto de guardado o control en el nivel
 * * @author Diego Dario Figueroa Mejia
 */
public class CheckPoint {
    private String nombre;
    private int posicionX;
    private int posicionY;
    private boolean activado;

    public CheckPoint(String nombre, int posicionX, int posicionY) {
        this.nombre = nombre;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.activado = false;
    }

    public String getNombre() { return nombre; }
    public int getPosicionX() { return posicionX; }
    public int getPosicionY() { return posicionY; }
    public boolean isActivado() { return activado; }

    /**
     * Activa el checkpoint para guardar el progreso del jugador
     */
    public void activar() {
        this.activado = true;
        System.out.println("Checkpoint " + nombre + " activado.");
    }
}