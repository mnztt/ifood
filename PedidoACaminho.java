package ifood;

public class PedidoACaminho implements EstadoPedido{
    private static PedidoACaminho instance = new PedidoACaminho();

    private PedidoACaminho() {}

    public static PedidoACaminho getInstance() {
        return instance;
    }

    @Override
    public void estado(Pedido pedido) {
        pedido.setEstado(PedidoEntregue.getInstance());
    }

    @Override
    public String getEstado() {
        return "A Caminho";
    }
}
