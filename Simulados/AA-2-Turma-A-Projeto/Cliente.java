
public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        setNome(nome);
        setCpf(cpf);
    }

    public void setCpf(String cpf) {
        cpf = cpf.trim();

        if (cpf.length() == 14)
            this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        nome = nome.trim();

        if (nome.contains(" "))
            this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
