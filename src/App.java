
import com.edu.uce.negocio.Pedido;
import com.edu.uce.negocio.PedidoService;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pedido p1 = new Pedido("Joseph", "Laptop", 1500, "jdcondorl@uce.edu.ec", "0969827765");

        Pedido p2 = new Pedido("Pablo", "Mouse", 50, "pmlayedra@uce.edu.ec", "0969000016");
        
        PedidoService service = new PedidoService();
        service.registrar(p1);
        service.registrar(p2);      
    }
}
