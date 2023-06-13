package ModuloDois.imposto;

import ModuloDois.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular (Orcamento orcamento);

}