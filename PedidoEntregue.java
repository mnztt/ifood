package ifood;

public class PedidoEntregue implements EstadoPedido {
    private static PedidoEntregue instance = new PedidoEntregue();

    private PedidoEntregue() {}

    public static PedidoEntregue getInstance() {
        return instance;
    }

    @Override
    public void estado(Pedido pedido) {
        System.out.println("Pedido já foi entregue.");
    }

    @Override
    public String getEstado() {
        return "Entregue";
    }
}
