import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteLampada {

    private Lampada lampada;

    @Before
    public void antesDeCadaTeste() {
        lampada = new Lampada();
    }

    @Test
    public void deveEstarApaga() {
        assertFalse("Ao instanciar deve estar apagada", lampada.estaAcessa());
    }

    @Test
    public void deveSerPossivelAcender() {
        lampada.acender();
        assertTrue("Deve ser possível acenter a lâmpada", lampada.estaAcessa());
    }

    @Test
    public void deveSerPossivelApagar() {
        lampada.acender();
        lampada.apagar();
        assertFalse("Deve ser possível apagar a lâmpada", lampada.estaAcessa());
    }

}
