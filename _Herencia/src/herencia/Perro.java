package herencia;

public class Perro extends Animal {

    public Perro(int estatura, int peso, String raza) {
        super(estatura, peso, raza);
    }

    public void ladrar() {
        System.out.println("Guau guau");
    }

    public void presentar() {
        String raza = this.getRaza();
        System.out.println("Hola, soy un perro %s".formatted(raza));
    }

}
