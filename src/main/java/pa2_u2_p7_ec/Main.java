package pa2_u2_p7_ec;
import java.time.LocalDateTime;
import java.util.Optional;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import pa2_u2_p7_ec.Pedidos.Application.PedidoService;
import pa2_u2_p7_ec.Pedidos.Domain.Model.Pedido;


@QuarkusMain 
public class Main implements QuarkusApplication{

    
    @Inject
    private PedidoService pedidoService;

    
    public static void main(String[] args){
        Quarkus.run(Main.class,args);
    }


    @Override
    public int run(String... args) throws Exception {

        System.out.println("Hello Quarkus!");
         // READ (buscar)
        Optional<Pedido> pedido = Optional.ofNullable(this.pedidoService.buscarPorId(100));
        if (pedido.isPresent()) {
        System.out.println("Pedido encontrado: " + pedido.get());
        } else {
        System.out.println("Pedido no encontrado");
        }

        // READ By Number
        Optional<Pedido> pedidoByNumber = this.pedidoService.buscarPorNumero("PED-0001");
        if (pedidoByNumber.isPresent()) {
        System.out.println("Pedido encontrado por número: " + pedidoByNumber.get());
        } else {
        System.out.println("Pedido no encontrado por número");
        }


        
       return 0;
    }

}