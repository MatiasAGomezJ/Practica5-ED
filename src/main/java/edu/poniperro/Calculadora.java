package edu.poniperro;

public class Calculadora implements ICalculadora {
    @Override
    public double sumar(double sumandoA, double sumandoB) {
        return sumandoA + sumandoB;
    }

    @Override
    public double restar(double minuendo, double sustraendo) {
        return minuendo - sustraendo;
    }

    @Override
    public double multiplicar(double factorA, double factorB) {
        return factorA * factorB;
    }

    @Override
    public double dividir(double dividendo, double divisor) {
        return dividendo / divisor;
    }
}
