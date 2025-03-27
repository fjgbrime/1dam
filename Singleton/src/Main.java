public class Main {
    public static void main(String[] args) {
        Configurador configurador1 = Configurador.getInstancia("http://miapp.com", "miBaseDatos");
        Configurador configurador2 = Configurador.getInstancia("http://otraapp.com", "otraBaseDatos");

        // Ambos configuradores deben ser la misma instancia
        System.out.println(configurador1.getUrl()); // Salida: http://miapp.com
        System.out.println(configurador2.getUrl()); // Salida: http://miapp.com

        // Cambiar la URL usando configurador2
        configurador2.setUrl("http://nuevaurl.com");

        // Verificar que el cambio se refleja en configurador1
        System.out.println(configurador1.getUrl()); // Salida: http://nuevaurl.com
    }
}
