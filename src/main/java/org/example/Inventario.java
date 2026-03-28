package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa el inventario del juego, capaz de almacenar objetos Inventariables
 * * @author Diego Dario Figueroa Mejia
 */
public class Inventario {
    private int capacidadMaxima;
    private List<Inventariable> items;

    /**
     * Constructor del inventario
     * * @param capacidadMaxima El número máximo de objetos que puede guardar.
     */
    public Inventario(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.items = new ArrayList<>();
    }

    public int getCapacidadMaxima() { return capacidadMaxima; }
    public List<Inventariable> getItems() { return items; }

    /**
     * Agrega un nuevo ítem al inventario si hay espacio disponible.
     * * @param item El objeto Inventariable a agregar.
     * @return true si se agregó con éxito, false si el inventario está lleno.
     */
    public boolean agregarItem(Inventariable item) {
        if (items.size() < capacidadMaxima) {
            items.add(item);
            item.registrar();
            return true;
        }
        System.out.println("Inventario lleno. No se puede agregar.");
        return false;
    }

    /**
     * Elimina un ítem del inventario.
     * * @param item El objeto Inventariable a eliminar
     * @return true si se eliminó correctamente, false si no se encontró.
     */
    public boolean eliminarItem(Inventariable item) {
        if (items.remove(item)) {
            item.borrar();
            return true;
        }
        return false;
    }

    /**
     * Imprime en consola la lista de todos los ítems actuales en el inventario
     */
    public void listarItems() {
        System.out.println("- Inventario -");
        for (Inventariable item : items) {
            if (item instanceof Arma) {
                System.out.println("- Arma: " + ((Arma) item).getNombre());
            } else if (item instanceof Recompensa) {
                System.out.println("- Recompensa: " + ((Recompensa) item).getNombre());
            }
        }
    }
}