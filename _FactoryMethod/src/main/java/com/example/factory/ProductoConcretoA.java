package com.example.factory;

/**
 * ProductoConcretoA implementa la interfaz Producto.
 * Representa uno de los objetos concretos que la fábrica puede crear.
 */
public class ProductoConcretoA implements Producto {

    /**
     * Implementación específica de la operación para ProductoConcretoA.
     */
    @Override
    public void operacion() {
        System.out.println("Operación en ProductoConcretoA ejecutada.");
        // Aquí podría ir lógica específica de este producto
    }
}
