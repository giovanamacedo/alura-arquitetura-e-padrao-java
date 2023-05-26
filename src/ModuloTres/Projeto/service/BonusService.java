package ModuloTres.Projeto.service;

import java.math.BigDecimal;

import ModuloTres.Projeto.modelo.Funcionario;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("Funcionário com salário maior que 1000,00");
		}
		return valor;
	}

}
