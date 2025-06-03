package ifood;

public class Funcionario implements Pessoa{
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
