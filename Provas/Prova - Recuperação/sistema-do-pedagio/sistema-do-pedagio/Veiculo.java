
public abstract class Veiculo {
	
	private int numeroDeEixos;
	private String placa;
	
	public Veiculo(String placa, int numeroDeEixos) {
		this.placa = placa;
		this.numeroDeEixos = numeroDeEixos;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public int getNumeroDeEixos() {
		return numeroDeEixos;
	}
	
	public abstract double getTarifa();
	public abstract String getTipo();
	public abstract String getTipoDeTarifa();
}
