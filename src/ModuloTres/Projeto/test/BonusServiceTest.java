package ModuloTres.Projeto.test;

import ModuloTres.Projeto.modelo.Funcionario;
import ModuloTres.Projeto.service.BonusService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {

    @Test public void bonusDeveriaSerZeroParaSalarioAlto(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Giovana", LocalDate.now(), new BigDecimal("25000")));

        assertEquals(BigDecimal.ZERO, bonus);
    }

    @Test public void bonusDeveriaSerDezPorcentoDoSalario(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Giovana", LocalDate.now(), new BigDecimal("2500")));

        assertEquals(new BigDecimal("250"), bonus);
    }
}
