package ifood;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IfoodTestes {
    private Pedido pedido;
    private Cliente cliente;

    @BeforeEach
    void setUp() {
        pedido = new Pedido();
        cliente = new Cliente("João");
        pedido.addObserver((Observer) cliente);
    }

    @Test
    void testEstadoInicial() {
        assertEquals("Confirmado", pedido.getEstado().getEstado());
    }
}
