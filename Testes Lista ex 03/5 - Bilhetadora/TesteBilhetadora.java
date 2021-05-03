import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteBilhetadora {
	
	private static final double DELTA = 0.001;
	private Bilhetadora bilhetadora;

	@Before
	public void antesDeCadaTeste() {
		bilhetadora = new Bilhetadora(50);
	}

	@Test
	public void deveSerPossivelDefinirOPrecoDoBilheteNaInstanciacao() {
		assertEquals(50, bilhetadora.getPreco(), DELTA);
	}
	
	@Test
	public void deveSerPossivelAlterarOPrecoDoBilhete() {
		bilhetadora.setPreco(10);
		assertEquals(10, bilhetadora.getPreco(), DELTA);
	}

	@Test
	public void naoDeveAceitarValoresNegativosParaOPreco() {
		bilhetadora.setPreco(-10);
		assertEquals(50, bilhetadora.getPreco(), DELTA);
		
		bilhetadora = new Bilhetadora(-50);
		assertEquals(0, bilhetadora.getPreco(), DELTA);
	}
	
	@Test
	public void deveTerSaldoETotalArrecadoIgualaZero() {
		assertEquals(0, bilhetadora.getSaldo(), DELTA);
		assertEquals(0, bilhetadora.getTotalArrecadado(), DELTA);
	}
	
	@Test
	public void deveInserirDinheiro() {
		bilhetadora.inserir(10);
		bilhetadora.inserir(15);
		
		assertEquals(25, bilhetadora.getSaldo(), DELTA);
	}
	
	@Test
	public void naoDeveAceitarValoresNegativos() {
		bilhetadora.inserir(10);
		bilhetadora.inserir(-15);
		
		assertEquals(10, bilhetadora.getSaldo(), DELTA);
	}
	
	@Test
	public void deveSerPossivelRestituirOValorInserido() {
		bilhetadora.inserir(20);
		
		assertEquals(20, bilhetadora.restituirSaldo(), DELTA);
		assertEquals(0, bilhetadora.getSaldo(), DELTA);
	}
	
	@Test
	public void deveRetornarOBilheteQuandoTiverSaldo() {
		bilhetadora.inserir(50);
		String bilhete =  "##################";
		       bilhete += "# The BlueJ Line";
		       bilhete += "# Ticket";
		       bilhete += "# " + bilhetadora.getPreco() + " cents.";
		       bilhete += "##################";
        
		assertEquals(bilhete, bilhetadora.getBilhete());       
	}
	
	@Test
	public void naoDeveRetornarOBilheteSeNaoTiverSaldo() {
		assertEquals("", bilhetadora.getBilhete()); 
	}
	
	@Test
	public void deveDiminuirOSaldoAoRetornarOBilhete() {
		bilhetadora.inserir(120);
		
		assertEquals(120, bilhetadora.getSaldo(), DELTA);
		bilhetadora.getBilhete();
		
		assertEquals(70, bilhetadora.restituirSaldo(), DELTA);
		assertEquals(0, bilhetadora.getSaldo(), DELTA);
	}
	
	@Test
	public void deveIncrementarOValorArrecadoACadaBilheteVendido() {
		bilhetadora.inserir(120);
		bilhetadora.getBilhete();
		assertEquals(50, bilhetadora.getTotalArrecadado(), DELTA);
		bilhetadora.getBilhete();
		assertEquals(100, bilhetadora.getTotalArrecadado(), DELTA);
		
		assertEquals(20, bilhetadora.getSaldo(), DELTA);
		assertEquals(20, bilhetadora.restituirSaldo(), DELTA);
		assertEquals(0, bilhetadora.getSaldo(), DELTA);
	}
	
}
