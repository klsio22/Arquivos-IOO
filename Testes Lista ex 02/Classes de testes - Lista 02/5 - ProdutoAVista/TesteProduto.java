import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TesteProduto
{
    private static final double DELTA = 0.001;
    private Produto produto;
    
    @Before
    public void antesDeCadaTeste() {
        produto = new Produto();
    }
    
    @Test
    public void deveAlterarOPreco() {
        produto.setPreco(100);
        assertEquals(100, produto.getPreco(), DELTA); 
    }
    
    @Test
    public void deveAlterarAPorcentagemDeDesconto() {
        produto.setPorcentagemDeDesconto(50);
        assertEquals(50, produto.getPorcentagemDeDesconto(), DELTA); 
    }
    
    @Test
    public void deveRetornarOPrecoAVista() {
        produto.setPreco(50);
        produto.setPorcentagemDeDesconto(25);
        assertEquals(37.5, produto.getPrecoAVista(), DELTA); 
    }
}