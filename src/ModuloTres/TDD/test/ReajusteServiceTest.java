package ModuloTres.TDD.test;

import ModuloTres.TDD.modelo.Desempenho;
import ModuloTres.TDD.service.ReajusteService;
import ModuloTres.TDD.modelo.Funcionario;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    private ReajusteService reajusteService;
    private Funcionario funcionario;

    @BeforeEach //antes de cada metodo, instancie com esse método
    public void inicializar(){
        reajusteService = new ReajusteService();
        funcionario = new Funcionario("Giovana", LocalDate.now(), new BigDecimal("1000.00"));
    }

    @Test
    public void reajusteDeveriaSerTresPorcentoComDesempenhoADesejar(){
        reajusteService.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerQuinzePorcentoComDesempenhoBom(){
        reajusteService.concederReajuste(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerVintePorcentoComDesempenhoOtimo(){
        reajusteService.concederReajuste(funcionario, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
