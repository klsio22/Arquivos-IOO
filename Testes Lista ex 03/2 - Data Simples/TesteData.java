import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteData {

	private Data data;
	
	@Before
	public void antesDeCadaTeste() {
		data = new Data(10, 10, 2017);
	}

	@Test
	public void deveSerInstanciadaInformandoDiaMesAnoSeparadamente() {
		assertEquals("10/10/2017", data.getData());
	}

	@Test
	public void deveSerInstanciadaInformandoUmaString() {
		data = new Data("11/12/2017");
		assertEquals("11/12/2017", data.getData());
	}
	
	@Test
	public void deveIncluirOZeroNoDiaEAnoCasoValorSejaMenorQue10() {
		data = new Data(1, 1, 2017);
		assertEquals("01/01/2017", data.getData());
	}
}
