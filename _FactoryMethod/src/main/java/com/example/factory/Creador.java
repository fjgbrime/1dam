package com.example.factory;

/**
 * La clase Creador (o Fábrica) declara el método de fábrica `factoryMethod()`,
 * que debe devolver un objeto de tipo Producto. Las subclases de Creador
 * usualmente proporcionan la implementación de este método.
 */
public abstract class Creador {

    /**
     * Este es el método de fábrica abstracto. Las subclases deben implementarlo
     * para crear el tipo de producto específico.
     * @return Un objeto Producto.
     */
    public abstract Producto factoryMethod();

    /**
     * El Creador también puede proporcionar una implementación por defecto
     * de alguna operación que utiliza el Producto creado por factoryMethod().
     * Las subclases pueden heredar o sobrescribir esta operación.
     */
    public void algunaOperacion() {
        // Llama al método de fábrica para crear un objeto Producto.
        Producto producto = factoryMethod();
        // Ahora, usa el producto.
        System.out.print("Creador: Ejecutando 'algunaOperacion' que utiliza el producto creado -> ");
        producto.operacion();
    }
}
