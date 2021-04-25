import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestePessoa {

    private Pessoa p;
    
    @Before
    public void executadoAntesDeCadaTeste() {
        p = new Pessoa();
        p.setNome("Rafael");
        p.setSobrenome("Almeida");
    }
    
    @Test 
    public void deveAlterarOAtributoNome() {
        assertEquals("Rafael", p.getNome());
    }

    @Test 
    public void deveAlterarOAtributoSobrenome() {
        assertEquals("Almeida", p.getSobrenome());
    }

    @Test 
    public void deveRetornarONomeCompleto() {
        assertEquals("Rafael Almeida", p.getNomeCompleto());
    }
}
