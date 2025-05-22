package com.example.factory;

/**
 * CreadorConcretoB sobrescribe el método de fábrica para devolver una instancia de ProductoConcretoB.
 * Esta es otra fábrica concreta que produce un tipo diferente de producto.
 */
public class CreadorConcretoB extends Creador {

    /**
     * Implementación del método de fábrica para crear y devolver un ProductoConcretoB.
     * @return Un nuevo objeto ProductoConcretoB.
     */
    @Override
    public Producto factoryMethod() {
        return new ProductoConcretoB();
    }
}
