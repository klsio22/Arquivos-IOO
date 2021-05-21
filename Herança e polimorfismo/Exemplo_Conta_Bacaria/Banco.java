import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {
	private static int numeroSequencial = 1;
	
    private ArrayList<ContaCorrente> contasCorrente;
    private ArrayList<ContaPoupanca> contasPoupanca;

    public Banco() {
    	contasCorrente = new ArrayList<>();
    	contasPoupanca = new ArrayList<>();
    }

    public void registrarCorrente(Cliente cliente) {
        contasCorrente.add(new ContaCorrente(cliente, numeroSequencial++));
    }
    
    public void registrarContaPoupanca(Cliente cliente) {
    	contasPoupanca.add(new ContaPoupanca(cliente, numeroSequencial++));
    }

    public void processarContas() {
        for (ContaCorrente contaCorrente : contasCorrente) {
        	contaCorrente.cobrarTaxaAdministrativa();
		}  
        
        for (ContaPoupanca contaPoupanca : contasPoupanca) {
			contaPoupanca.pagarJuros();
		}
    }
    
    public List<ContaCorrente> getContasCorrente() {
    	return Collections.unmodifiableList(contasCorrente);
    }
    
    public List<ContaPoupanca> getContasPoupanca() {
    	return Collections.unmodifiableList(contasPoupanca);
    }
    
    public ContaCorrente getContaCorrente(int numero) {
    	for (ContaCorrente contaCorrente : contasCorrente) {
			if (contaCorrente.getNumero() == numero)
				return contaCorrente;
		}
    	return null;
    }
    
    public ContaPoupanca getContaPoupanca(int numero) {
    	for (ContaPoupanca contaPoupanca : contasPoupanca) {
			if (contaPoupanca.getNumero() == numero)
				return contaPoupanca;
		}
    	return null;
    }
}
