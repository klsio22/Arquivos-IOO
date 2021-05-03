import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TesteCronometro {
    
    private Cronometro cronometro;
    
    @Before
    public void executadoAntesDeCadaTeste() {
        cronometro = new Cronometro();
    }
    
    @Test
    public void inicialmenteOValorDeveSerZero() { 
        assertEquals(0, cronometro.getValor());
    }

    @Test
    public void deveIncrementarOValor() {
        cronometro.incrementa();
        assertEquals(1, cronometro.getValor());
    }

    @Test
    public void deveSerPossivelZerarOCronometro() {
        cronometro.incrementa();
        cronometro.incrementa();
        cronometro.incrementa();
        assertEquals(3, cronometro.getValor());
        
        cronometro.zera();
        assertEquals(0, cronometro.getValor());
    }
}
