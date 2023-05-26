package ModuloTres.TDD.test;

import ModuloTres.TDD.modelo.Desempenho;
import ModuloTres.TDD.service.ReajusteService;
import ModuloTres.TDD.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {
    @Test
    public void reajusteDeveriaSerTresPorcentoComDesempenhoADesejar(){
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario("Giovana", LocalDate.now(), new BigDecimal("1000.00"));

        reajusteService.concederReajuste(funcionario, Desempenho.A_DESEJAR);

        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerQuinzePorcentoComDesempenhoBom(){
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario("Giovana", LocalDate.now(), new BigDecimal("1000.00"));

        reajusteService.concederReajuste(funcionario, Desempenho.BOM);

        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerVintePorcentoComDesempenhoOtimo(){
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario("Giovana", LocalDate.now(), new BigDecimal("1000.00"));

        reajusteService.concederReajuste(funcionario, Desempenho.OTIMO);

        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
