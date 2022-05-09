package edu.poniperro;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    static Calculadora calculadora;

    @BeforeAll
    static void setup() {
        calculadora = new Calculadora();
    }

    @Test
    void sumarTest() {
        assertEquals(10.0, calculadora.sumar(4.0, 6.0));
    }

    @Test
    void restarTest() {
        assertEquals(-8.0, calculadora.restar(2.0, 10.0));
    }

    @Test
    void multiplicarTest() {
        assertEquals(27.0, calculadora.multiplicar(9.0, 3.0));
    }

    @Test
    void dividirTest() {
        assertEquals(3.0, calculadora.dividir(6.0, 2.0));
    }
}