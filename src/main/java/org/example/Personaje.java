package org.example;

/**
 * Clase que representa a un personaje dentro del juego
 * Puede recibir daño, ser destruido y moverse dinámicamente
 * * @author Diego Dario Figueroa Mejia
 */
public class Personaje implements Destruible, ElementoDinamico {
    private String nombre;
    private int vida;
    private int posicionX;
    private int posicionY;

    public Personaje(String nombre, int vida, int posicionX, int posicionY) {
        this.nombre = nombre;
        this.vida = vida;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public String getNombre() { return nombre; }
    public int getVida() { return vida; }
    public int getPosicionX() { return posicionX; }
    public int getPosicionY() { return posicionY; }

    public void setPosicion(int x, int y) {
        this.posicionX = x;
        this.posicionY = y;
    }

    /**
     * Reduce la vida del personaje basado en el daño recibido.
     * * @param daño Cantidad de puntos de vida a restar.
     */
    public void recibirDaño(int daño) {
        this.vida -= daño;
        System.out.println(nombre + " recibio " + daño + " de daño. Vida actual: " + vida);
    }

    @Override
    public void mover(String direccion, int distancia) {
        switch (direccion.toLowerCase()) {
            case "norte": this.posicionY += distancia; break;
            case "sur": this.posicionY -= distancia; break;
            case "este": this.posicionX += distancia; break;
            case "oeste": this.posicionX -= distancia; break;
        }
        System.out.println(nombre + " se movio al " + direccion + " " + distancia + " unidades. Nueva posicion: (" + posicionX + ", " + posicionY + ")");
    }

    @Override
    public void destruye() {
        this.vida = 0;
        System.out.println("Oh nooooo, " + nombre + " ha sido eliminado.");
    }
}