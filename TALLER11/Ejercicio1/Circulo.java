package Ejercicio1;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio, String unidades) {
        super(unidades);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * getRadio() * getRadio();
    }
}

