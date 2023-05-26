package ModuloTres.Projeto.test;

import ModuloTres.Projeto.modelo.Funcionario;
import ModuloTres.Projeto.service.BonusService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @Test
    public void bonusDeveriaSerZeroParaSalarioAlto(){
        BonusService service = new BonusService();
        /*assertThrows(IllegalArgumentException.class,
                    () -> service.calcularBonus(new Funcionario("Giovana", LocalDate.now(), new BigDecimal("25000"))));*/

        //Outra forma de testa exception
        try{
            service.calcularBonus(new Funcionario("Giovana", LocalDate.now(), new BigDecimal("25000")));
            fail("Não deu a exception");
        }
        catch (Exception e)
        {
            assertEquals("Funcionário com salário maior que 1000,00", e.getMessage());
        }
    }

    @Test
    public void bonusDeveriaSerDezPorcentoDoSalario(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Giovana", LocalDate.now(), new BigDecimal("2500")));

        assertEquals(new BigDecimal("250.0"), bonus);
    }

    @Test
    public void bonusDeveriaSerDezPorcentoParaDezMil(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Giovana", LocalDate.now(), new BigDecimal("10000")));

        assertEquals(new BigDecimal("1000.0"), bonus);
    }
}
