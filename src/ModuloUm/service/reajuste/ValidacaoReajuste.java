package ModuloUm.service.reajuste;

import ModuloUm.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {
    void validar (Funcionario funcionario, BigDecimal aumento);
}
