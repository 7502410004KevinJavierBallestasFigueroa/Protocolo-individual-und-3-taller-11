package Ejercicio2;

public class Vendedor extends Empleado {
    private double comision;

    public Vendedor(String nombre, double salarioBase, double comision) {
        super(nombre, salarioBase);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return super.getSalarioBase() + getComision();
    }
}
