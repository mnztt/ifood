package ifood;

public class PedidoConfirmado implements EstadoPedido{
    private static PedidoConfirmado instance = new PedidoConfirmado();

    private PedidoConfirmado() {}

    public static PedidoConfirmado getInstance() {
        return instance;
    }

    @Override
    public void estado(Pedido pedido) {
        pedido.setEstado(PedidoACaminho.getInstance());
    }

    @Override
    public String getEstado() {
        return "Confirmado";
    }
}
