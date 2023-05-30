package ModuloDois;

import ModuloDois.imposto.CalculadoraDeImposto;
import ModuloDois.imposto.TipoImposto;
import ModuloDois.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();
        System.out.println(calculadoraDeImposto.calcular(orcamento, TipoImposto.ISS));
    }
}
