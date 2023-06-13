package ModuloDois.test;

import ModuloDois.loja.imposto.CalculadoraDeImposto;
import ModuloDois.loja.imposto.ISS;
import ModuloDois.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();
        System.out.println(calculadoraDeImposto.calcular(orcamento, new ISS()));
    }
}
