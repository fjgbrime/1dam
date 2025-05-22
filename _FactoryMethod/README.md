# Patrón de Diseño: Factory Method (Método de Fábrica) en Java

Este proyecto contiene un ejemplo en Java que ilustra el patrón de diseño Factory Method. Todas las explicaciones y comentarios en el código fuente también están en español.

## ¿Qué es el Patrón Factory Method?

El Patrón Factory Method es un patrón de diseño creacional que proporciona una interfaz para crear objetos en una superclase, pero permite a las subclases alterar el tipo de objetos que se crearán. En otras palabras, delega la responsabilidad de la instanciación a las subclases.

**Propósito Principales:**
*   Define una interfaz para crear un objeto, pero deja que sean las subclases quienes decidan qué clase instanciar.
*   Permite que una clase delegue la instanciación a subclases.

**Componentes Clave:**
1.  **Producto (Product):** Define la interfaz para los objetos que el método de fábrica crea.
2.  **ProductoConcreto (ConcreteProduct):** Implementa la interfaz Producto. Son los objetos específicos que se crean.
3.  **Creador (Creator / Factory):** Declara el método de fábrica (`factoryMethod`), que devuelve un objeto de tipo Producto. También puede definir una implementación por defecto del método de fábrica que devuelve un objeto ProductoConcreto por defecto.
4.  **CreadorConcreto (ConcreteCreator / ConcreteFactory):** Sobrescribe el método de fábrica para devolver una instancia de un ProductoConcreto específico.

## Estructura del Ejemplo

El código fuente se encuentra en el directorio `src/main/java/com/example/factory/` y consta de los siguientes archivos:

*   `Producto.java`: La interfaz para los productos.
*   `ProductoConcretoA.java`: Una implementación concreta de `Producto`.
*   `ProductoConcretoB.java`: Otra implementación concreta de `Producto`.
*   `Creador.java`: La clase abstracta `Creador` que declara el `factoryMethod` abstracto.
*   `CreadorConcretoA.java`: Una fábrica concreta que crea objetos `ProductoConcretoA`.
*   `CreadorConcretoB.java`: Una fábrica concreta que crea objetos `ProductoConcretoB`.
*   `Main.java`: La clase principal que demuestra cómo utilizar las fábricas para crear y utilizar los productos.

## ¿Cómo Funciona?

1.  El cliente (en nuestro caso, la clase `Main`) necesita un producto, pero en lugar de crearlo directamente usando el operador `new`, llama al método de fábrica en un objeto creador.
2.  El objeto creador (que es una instancia de una subclase de `Creador`, como `CreadorConcretoA` o `CreadorConcretoB`) implementa el `factoryMethod` para construir y devolver el tipo específico de producto que le corresponde.
3.  El cliente trata al producto devuelto a través de la interfaz común `Producto`, sin necesidad de conocer la clase concreta del producto que ha sido creado.

## Ejecutar el Ejemplo

Este es un ejemplo simple de Java y no requiere dependencias externas más allá del JDK.

1.  **Compilar:**
    Navega al directorio `_FactoryMethod/src/main/java/` desde tu terminal y ejecuta:
    ```bash
    javac com/example/factory/*.java -d ../../../out
    ```
    Esto compilará los archivos `.java` y colocará los archivos `.class` en un nuevo directorio `_FactoryMethod/out`. (Asegúrate de que el directorio `out` exista o créalo si es necesario: `mkdir -p _FactoryMethod/out`)

2.  **Ejecutar:**
    Navega al directorio `_FactoryMethod/out/` (o `_FactoryMethod/` si ajustas el classpath) y ejecuta la clase `Main`:
    ```bash
    java com.example.factory.Main
    ```
    O desde el directorio `_FactoryMethod/src/main/java/` (después de compilar como arriba):
    ```bash
    java -cp ../../../out com.example.factory.Main
    ```

Deberías ver la salida en la consola demostrando la creación de diferentes productos utilizando sus respectivas fábricas.

```
Ejemplo del Patrón Factory Method en Java:
-----------------------------------------

Utilizando CreadorConcretoA:
Creador: Ejecutando 'algunaOperacion' que utiliza el producto creado -> Operación en ProductoConcretoA ejecutada.
Llamada directa a factoryMethod() de CreadorConcretoA -> Operación en ProductoConcretoA ejecutada.
-----------------------------------------

Utilizando CreadorConcretoB:
Creador: Ejecutando 'algunaOperacion' que utiliza el producto creado -> Operación en ProductoConcretoB ejecutada.
Llamada directa a factoryMethod() de CreadorConcretoB -> Operación en ProductoConcretoB ejecutada.
-----------------------------------------
Demostración completada.
```

Este ejemplo ayuda a entender cómo el Factory Method permite desacoplar el código cliente de las clases concretas de los productos, haciendo el sistema más flexible y extensible.
