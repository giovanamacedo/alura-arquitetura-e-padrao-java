package ModuloDois.imposto;

import ModuloDois.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImposto {
    public BigDecimal calcular (Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    }
}
