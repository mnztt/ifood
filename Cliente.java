package ifood;

import java.util.Objects;
import java.util.Observable;
import java.util.Observer;

public class Cliente implements Pessoa, Observer {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void update(String estado) {
        System.out.println("Cliente " + nome + " foi notificado: Pedido " + estado);
    }
}
