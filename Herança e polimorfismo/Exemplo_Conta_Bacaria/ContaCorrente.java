public class ContaCorrente {

	private Cliente cliente;
	
	private int numero;
    private double saldo;
    private double taxaAdministrativa = 5;
    
    public ContaCorrente(Cliente cliente, int numero) {
    	this.cliente = cliente;
    	this.numero = numero;
    }
    
    public Cliente getCliente() {
    	return cliente;
    }
    
    public int getNumero() {
    	return numero;
    }
    
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public double sacar(double valor) {
        this.saldo -= valor;
        return valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void cobrarTaxaAdministrativa() {
    	sacar(taxaAdministrativa);
    }
}
