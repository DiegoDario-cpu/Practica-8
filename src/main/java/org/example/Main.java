package org.example;

/**
 * Clase principal que inicializa y ejecuta la simulación del videojuego
 * Se encarga de instanciar el nivel, los elementos y probar sus funcionalidades
 * * @author Diego Dario Figueroa Mejia
 */
public class Main {
    /**
     * Método principal que sirve como punto de entrada de la aplicación.
     * * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        Inventario inventarioNivel = new Inventario(10);

        Arma espada = new Arma("Espada Larga", 50, 2.5);
        Recompensa oro = new Recompensa("Bolsa de Oro", 100, "Moneda");
        inventarioNivel.agregarItem(espada);
        inventarioNivel.agregarItem(oro);

        Nivel nivel1 = new Nivel("Bosque Oscuro", 1, "Normal", inventarioNivel);

        nivel1.agregarObstaculo(new Obstaculo("Roca Gigante", 10, 5, 5));
        nivel1.agregarCheckPoint(new CheckPoint("Campamento", 10, 10));

        Personaje heroe = new Personaje("Diegosaurio", 100, 0, 0);
        Utileria pocion = new Utileria("Poción de Velocidad", "Aumenta la velocidad", 2, 2);


        nivel1.agregarElementoDinamico(heroe);
        nivel1.agregarElementoDinamico(pocion);


        nivel1.mostrarEstado();

        nivel1.moverElementosDinamicos();
        nivel1.moverElementosDinamicos();
    }
}