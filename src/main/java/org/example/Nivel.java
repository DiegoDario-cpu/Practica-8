package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Clase que representa un nivel completo del videojuego, incluyendo sus obstáculos,
 * checkpoints, elementos dinámicos y un inventario general.
 * * @author Diego Dario Figueroa Mejia
 */
public class Nivel {
    private String nombre;
    private int numero;
    private String dificultad;
    private List<Obstaculo> obstaculos;
    private List<CheckPoint> checkPoints;
    private List<ElementoDinamico> elementosDinamicos;
    private Inventario inventario;

    /**
     * Constructor de la clase Nivel.
     * * @param nombre Nombre descriptivo del nivel.
     * @param numero Número de orden del nivel.
     * @param dificultad Nivel de dificultad (ej. "Normal", "Difícil").
     * @param inventario Inventario asociado a este nivel.
     */
    public Nivel(String nombre, int numero, String dificultad, Inventario inventario) {
        this.nombre = nombre;
        this.numero = numero;
        this.dificultad = dificultad;
        this.inventario = inventario;
        this.obstaculos = new ArrayList<>();
        this.checkPoints = new ArrayList<>();
        this.elementosDinamicos = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public int getNumero() { return numero; }
    public String getDificultad() { return dificultad; }

    public void agregarObstaculo(Obstaculo obstaculo) {
        this.obstaculos.add(obstaculo);
    }

    public void agregarCheckPoint(CheckPoint checkPoint) {
        this.checkPoints.add(checkPoint);
    }

    public void agregarElementoDinamico(ElementoDinamico elemento) {
        this.elementosDinamicos.add(elemento);
    }

    /**
     * Mueve todos los elementos dinámicos registrados en el nivel de manera aleatoria
     * Selecciona una dirección al azar y una distancia entre 1 y 10 unidades
     */
    public void moverElementosDinamicos() {
        System.out.println("\n Moviendo Elementos Dinámicos Aleatoriamente ");
        String[] direcciones = {"norte", "sur", "este", "oeste"};
        Random random = new Random();

        for (ElementoDinamico elemento : elementosDinamicos) {
            String direccionAleatoria = direcciones[random.nextInt(direcciones.length)];
            int distanciaAleatoria = random.nextInt(10) + 1; // Distancia de 1 a 10
            elemento.mover(direccionAleatoria, distanciaAleatoria);
        }
    }

    /**
     * Muestra en consola el estado actual del nivel y todos sus componentes
     */
    public void mostrarEstado() {
        System.out.println("\n= Estado del Nivel: " + nombre + " (Nivel " + numero + ") =");
        System.out.println("Dificultad: " + dificultad);
        System.out.println("Obstáculos: " + obstaculos.size());
        System.out.println("CheckPoints: " + checkPoints.size());
        System.out.println("Elementos Dinámicos: " + elementosDinamicos.size());
        inventario.listarItems();
    }
}