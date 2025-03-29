package herencia;

public class Animal {
    protected int estatura;
    protected double peso;
    protected String raza;

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public Animal(){

    }
    public Animal(int estatura, int peso, String raza) {
        this.estatura = estatura;
        this.peso = peso;
        this.raza = raza;
    }

    public String toString() {
        return "Estatura: " + estatura + " Peso: " + peso + " Raza: " + raza;
    }


}
