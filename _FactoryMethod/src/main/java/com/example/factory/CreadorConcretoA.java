package com.example.factory;

/**
 * CreadorConcretoA sobrescribe el método de fábrica para devolver una instancia de ProductoConcretoA.
 * Esta es una de las fábricas concretas que produce un tipo específico de producto.
 */
public class CreadorConcretoA extends Creador {

    /**
     * Implementación del método de fábrica para crear y devolver un ProductoConcretoA.
     * @return Un nuevo objeto ProductoConcretoA.
     */
    @Override
    public Producto factoryMethod() {
        return new ProductoConcretoA();
    }
}
