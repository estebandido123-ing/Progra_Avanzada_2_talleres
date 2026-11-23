package pa2_u2_p7_ec;
import java.time.LocalDateTime;


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

        System.out.println("Hello Quarkus! ");


        //Create (insert)
        
        Pedido p1 = new Pedido();
        p1.setProducto("Prodcuto d eprueba");
        p1.setPrecio(1.1);
        p1.setFecha(LocalDateTime.now());

        this.pedidoService.guaradar(p1);
        

        //Read (Buscar)

        Pedido pedido = this.pedidoService.buscarPorId(1);
        System.out.println("Pedido encontrdo: "  + pedido);

        //Update(actualizar)
        System.out.println("Actualizando pedido");
        pedido.setPrecio(200.0);
        this.pedidoService.actualizar(pedido);
        Pedido pedido2 = this.pedidoService.buscarPorId(1);
        System.out.println("Pedido Encontrado: " + pedido2);


        //Delete (Eliminar)
        this.pedidoService.eliminar(1);

       return 0;
    }

}