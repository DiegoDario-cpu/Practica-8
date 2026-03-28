package org.example;

/**
 * Clase que representa un arma en el juego, la cual puede ser guardada en un inventario.
 * * @author Diego Dario Figueroa Mejia
 */
public class Arma implements Inventariable {
    private String nombre;
    private int daño;
    private double alcance;

    public Arma(String nombre, int daño, double alcance) {
        this.nombre = nombre;
        this.daño = daño;
        this.alcance = alcance;
    }

    public String getNombre() { return nombre; }
    public int getDaño() { return daño; }
    public double getAlcance() { return alcance; }

    @Override
    public void registrar() {
        System.out.println("Arma " + nombre + " registrada en el inventario.");
    }

    @Override
    public void borrar() {
        System.out.println("Arma " + nombre + " borrada del inventario.");
    }
}