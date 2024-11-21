package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos", 500000, 50000);
        Vendedor vendedor = new Vendedor("Ana", 300000, 20000);

        gerente.mostrarDetalles();
        System.out.println("");
        vendedor.mostrarDetalles();
    }
}
