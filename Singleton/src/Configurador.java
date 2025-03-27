public class Configurador {
    private String url;
    private String baseDatos;
    private static Configurador instancia;

    // Constructor privado para evitar la creación de instancias desde fuera
    private Configurador(String url, String baseDatos) {
        this.url = url;
        this.baseDatos = baseDatos;
    }

    // Método estático para obtener la única instancia de la clase
    public static Configurador getInstancia(String url, String baseDatos) {
        if (instancia == null) {
            instancia = new Configurador(url, baseDatos);
        }
        return instancia;
    }

    // Métodos getter y setter
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBaseDatos() {
        return baseDatos;
    }

    public void setBaseDatos(String baseDatos) {
        this.baseDatos = baseDatos;
    }
}
