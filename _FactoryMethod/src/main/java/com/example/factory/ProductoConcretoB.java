package com.example.factory;

/**
 * ProductoConcretoB implementa la interfaz Producto.
 * Representa otro de los objetos concretos que la fábrica puede crear.
 */
public class ProductoConcretoB implements Producto {

    /**
     * Implementación específica de la operación para ProductoConcretoB.
     */
    @Override
    public void operacion() {
        System.out.println("Operación en ProductoConcretoB ejecutada.");
        // Aquí podría ir lógica específica de este producto
    }
}
