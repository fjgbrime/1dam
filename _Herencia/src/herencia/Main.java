package herencia;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        Gato gato = new Gato(20, 5, "Siamés");
        Perro perro = new Perro(30, 10, "Labrador");

        System.out.println(gato);
        System.out.println(perro);

        perro.ladrar();
        perro.presentar();
        gato.maullar();
    }
}