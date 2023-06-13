package ModuloDois.loja.imposto;

import ModuloDois.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImposto {
    public BigDecimal calcular (Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    }
}
