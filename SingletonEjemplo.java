// El patrón Singleton asegura que una clase solo tenga una instancia y proporciona un punto de acceso global a ella.
public class SingletonEjemplo {

    // La instancia única de la clase. 'volatile' asegura que los cambios sean visibles entre hilos.
    private static volatile SingletonEjemplo instance;

    // Constructor privado para prevenir la instanciación directa desde fuera de la clase.
    // Esto es crucial para asegurar que solo se pueda crear una instancia a través del método getInstance().
    private SingletonEjemplo() {
        // Constructor privado para prevenir instanciación directa
    }

    // Proporciona el punto de acceso global a la instancia Singleton.
    // Utiliza inicialización diferida (lazy initialization) y es seguro para hilos (thread-safe).
    public static SingletonEjemplo getInstance() {
        // Doble verificación de nulidad para optimizar el rendimiento en accesos concurrentes
        // una vez que la instancia ya ha sido creada.
        if (instance == null) {
            // Bloqueo sincronizado para asegurar que solo un hilo pueda crear la instancia
            // en caso de que múltiples hilos intenten accederla simultáneamente por primera vez.
            synchronized (SingletonEjemplo.class) {
                // Segunda verificación de nulidad dentro del bloque sincronizado para asegurar
                // que la instancia no haya sido creada por otro hilo mientras se esperaba el bloqueo.
                if (instance == null) {
                    instance = new SingletonEjemplo(); // Creación de la instancia si aún no existe.
                }
            }
        }
        return instance; // Devuelve la instancia única.
    }

    public static void main(String[] args) {
        // Obtener la instancia del Singleton dos veces
        SingletonEjemplo instancia1 = SingletonEjemplo.getInstance();
        SingletonEjemplo instancia2 = SingletonEjemplo.getInstance();

        // Imprimir en la consola las dos instancias
        System.out.println("Instancia 1: " + instancia1);
        System.out.println("Instancia 2: " + instancia2);

        // Comparar si instancia1 e instancia2 son la misma instancia
        boolean sonLaMisma = (instancia1 == instancia2);
        System.out.println("¿Son la misma instancia?: " + sonLaMisma);
    }
}
