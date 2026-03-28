package org.example;

/**
 * Clase que representa objetos de utilería (como pociones o herramientas)
 * que pueden usarse y moverse en el mapa.
 * * @author Diego Dario Figueroa Mejia
 */
public class Utileria implements ElementoDinamico {
    private String nombre;
    private String descripcion;
    private int posicionX;
    private int posicionY;
    private boolean usada;

    public Utileria(String nombre, String descripcion, int posicionX, int posicionY) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.usada = false;
    }

    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public int getPosicionX() { return posicionX; }
    public int getPosicionY() { return posicionY; }
    public boolean isUsada() { return usada; }

    /**
     * Marca la utilería como usada e imprime un mensaje en consola
     */
    public void usar() {
        this.usada = true;
        System.out.println("Se ha usado la utilería: " + nombre);
    }

    @Override
    public void mover(String direccion, int distancia) {
        switch (direccion.toLowerCase()) {
            case "norte": this.posicionY += distancia; break;
            case "sur": this.posicionY -= distancia; break;
            case "este": this.posicionX += distancia; break;
            case "oeste": this.posicionX -= distancia; break;
        }
        System.out.println("Utileria " + nombre + " se movio al " + direccion + " " + distancia + " unidades. Posicion: (" + posicionX + ", " + posicionY + ")");
    }
}