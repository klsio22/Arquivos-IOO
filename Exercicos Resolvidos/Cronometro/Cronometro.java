public class Cronometro {

    private int valor;

    public int getValor() {
        return valor;
    }

    public void incrementa() {
        valor = valor + 1;
    }

    public void zera() {
        valor = 0;
    }
}