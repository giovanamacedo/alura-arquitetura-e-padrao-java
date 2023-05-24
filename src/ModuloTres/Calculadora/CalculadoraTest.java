package ModuloTres.Calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @Test
    public void deveriaSomarNumerosPositivos(){
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar(3, 7);

        assertEquals(10, soma);
    }
}
