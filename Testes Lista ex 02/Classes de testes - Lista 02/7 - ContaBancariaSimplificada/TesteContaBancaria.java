
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TesteContaBancaria
{
	private static final double DELTA = 0.001;
    private ContaBancaria conta;
    
    @Before
    public void antesDeCadaTeste() {
        conta = new ContaBancaria();
    }

    @Test
    public void deveTerSaldoInicialZero() {
        assertEquals(0, conta.getSaldo(), DELTA);
    }
    
    @Test
    public void deveTerSaldoAlteradoQuandoForDepositado() {
        conta.depositar(50);
        assertEquals(50, conta.getSaldo(), DELTA);
    }
    
    @Test
    public void devePermitirFazerRetiradaDaConta() {
        conta.depositar(300);

        assertEquals(100, conta.sacar(100), DELTA);
        assertEquals(200, conta.getSaldo(), DELTA);
    }
    
    @Test
    public void devePagarJuros() {
        conta.depositar(300);
        conta.pagaJuros();
        
        assertEquals(315, conta.getSaldo(), DELTA);
    }
}
