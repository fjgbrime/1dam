package herencia;

public class Gato extends Animal{
    public Gato(int estatura, int peso, String raza) {
        super(estatura, peso, raza);
    }

    public void maullar() {
        System.out.println("Miau miau");
    }
}
