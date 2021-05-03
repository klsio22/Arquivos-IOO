import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestePonto {

	private Ponto p;

	@Before
	public void antesDeCadaTeste() {
		p = new Ponto();
	}

	@Test
	public void deveTerValorInicialZero() {
		assertEquals(0, p.getX());
		assertEquals(0, p.getY());
	}

	@Test
	public void deveInstanciarUmPontoInformandoOsValoresDeXeY() {
		p = new Ponto(10, 20);
		assertEquals(10, p.getX());
		assertEquals(20, p.getY());
	}
	
	@Test
	public void deveTerRepresentacao() {
		assertEquals("P(0,0)", p.toString());
	}
}
