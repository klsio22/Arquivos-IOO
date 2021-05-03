import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestePoupanca {

	private static final double DELTA = 0.001;
	private Poupanca poupanca;

	@Before
	public void antesDeCadaTeste() {
		poupanca = new Poupanca();
	}

	@Test
	public void deveAlterarOValorInicial() {
		poupanca.setValorInicial(100);
		assertEquals(100, poupanca.getValorInicial(), DELTA); 
	}

	@Test
	public void deveAlterarOAporteMensal() {
		poupanca.setAporteMensal(100);
		assertEquals(100, poupanca.getAporteMensal(), DELTA); 
	}

	@Test
	public void deveAlterarOPrazoMensal() {
		poupanca.setPrazoEmMeses(10);
		assertEquals(10, poupanca.getPrazoEmMeses(), DELTA); 
	}

	@Test
	public void deveAlterarATaxaDeJurosMensal() {
		poupanca.setTaxaJurosMensal(15);
		assertEquals(15, poupanca.getTaxaJurosMensal(), DELTA); 
	}

	@Test
	public void deveCalcularOSaldoFinalDoInvestimento() {
		poupanca.setValorInicial(100);
		poupanca.setAporteMensal(10);
		poupanca.setPrazoEmMeses(12);
		poupanca.setTaxaJurosMensal(0.5166);

		assertEquals(229.8473, poupanca.getSaldoNoFinalDoPrazo(), DELTA);
	}
}
