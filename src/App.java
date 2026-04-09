
import com.edu.uce.negocio.Pedido;
import com.edu.uce.negocio.PedidoService;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pedido p1 = new Pedido("Joseph", "CocaCola", 1200.0, "joseph@example.com");
        PedidoService service = new PedidoService();
        service.registrar(p1);
    }
}
