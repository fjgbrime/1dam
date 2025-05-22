package com.example.factory;

/**
 * Interfaz para el Producto.
 * Define la interfaz de los objetos que el método de fábrica crea.
 * Todos los productos concretos deben implementar esta interfaz.
 */
public interface Producto {
    /**
     * Operación que todos los productos concretos deben implementar.
     */
    void operacion();
}
