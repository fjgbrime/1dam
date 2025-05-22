package com.example.factory;

/**
 * Clase principal para demostrar el patrón Factory Method.
 * Esta clase actúa como el cliente que utiliza las fábricas para crear productos
 * sin conocer las clases concretas de los productos que se están creando.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Ejemplo del Patrón Factory Method en Java:");
        System.out.println("-----------------------------------------");

        // Crear una instancia de CreadorConcretoA
        Creador creadorA = new CreadorConcretoA();
        System.out.println("\nUtilizando CreadorConcretoA:");
        // Usar el método 'algunaOperacion' que internamente llama a factoryMethod()
        // para crear un ProductoConcretoA y luego llama a su método 'operacion()'.
        creadorA.algunaOperacion(); 

        // También podemos llamar directamente al factoryMethod para obtener el producto
        // y luego llamar a su operación.
        Producto productoA = creadorA.factoryMethod();
        System.out.print("Llamada directa a factoryMethod() de CreadorConcretoA -> ");
        productoA.operacion();

        System.out.println("-----------------------------------------");

        // Crear una instancia de CreadorConcretoB
        Creador creadorB = new CreadorConcretoB();
        System.out.println("\nUtilizando CreadorConcretoB:");
        // Usar el método 'algunaOperacion' que internamente llama a factoryMethod()
        // para crear un ProductoConcretoB y luego llama a su método 'operacion()'.
        creadorB.algunaOperacion();

        // Llamada directa al factoryMethod de CreadorConcretoB
        Producto productoB = creadorB.factoryMethod();
        System.out.print("Llamada directa a factoryMethod() de CreadorConcretoB -> ");
        productoB.operacion();
        
        System.out.println("-----------------------------------------");
        System.out.println("Demostración completada.");
    }
}
