package ifood;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Observable{
    private EstadoPedido estado;
    private List<Observer> observers = new ArrayList<>();

    public Pedido() {
        this.estado = PedidoConfirmado.getInstance();
    }

    public void proximoEstado() {
        estado.estado(this);
        notifyObservers();
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(estado.getEstado());
        }
    }
}
