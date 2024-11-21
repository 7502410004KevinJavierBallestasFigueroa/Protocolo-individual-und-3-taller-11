package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5,"cm2");
        System.out.println("******************circulo***********************");
        circulo.mostrarArea();
        System.out.println("******************rectangulo********************");
        Figura rectangulo = new Rectangulo(4, 6,"m2");
        rectangulo.mostrarArea();
    }
}

